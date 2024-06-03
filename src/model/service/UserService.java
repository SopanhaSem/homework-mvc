package model.service;

import model.User;
import model.dao.UserDao;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    void addNewUser(UserDto userDto);
    void deleteUserById(int id);
    void updateUser(User user);
}
