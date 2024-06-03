package controller;

import model.User;
import model.dao.UserDao;
import model.dto.UserDto;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
    public void addNewUsers(UserDto userDto){userService.addNewUser(userDto);}
    public void deleteUserById(int id){userService.deleteUserById(id);}
    public void updateUser(User user){userService.updateUser(user);}
}
