package model.service;

import mapper.Mapper;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{
    private final UserDao userDao = new UserDaoImpl();
    @Override
    public List<UserDto> getAllUsers() {
        return userDao.getAllUser()
                .stream()
                .map(Mapper::fromUserToUserDto)
                .toList();
    }
}
