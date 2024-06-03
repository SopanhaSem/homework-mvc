package model.dao;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private List<User> userList = new ArrayList<>(
            List.of(new User(1,"KoKo","koko123@gmail.com"),
                    new User(2,"KaKa","kaka123@gmail.com"))
    );
    @Override
    public void addNewUser(User user) {
        userList.add(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userList.removeIf(e->e.getId().equals(id));
    }

    @Override
    public void updateUser(User user) {
        for (int i = 0; i < userList.size(); i++) {
            User users = userList.get(i);
            if (user.getId() != null && user.getId().equals(user.getId())) {
                userList.set(i, users);
                break;
            }
        }
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }
}
