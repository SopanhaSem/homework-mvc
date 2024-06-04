package model.dao;

import model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<User> existingUserOpt = userList.stream()
                .filter(u -> u.getId().equals(user.getId()))
                .findFirst();
        if (existingUserOpt.isPresent()) {
            User existingUser = existingUserOpt.get();
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
        } else {
            System.out.println("[!] User not found with id: " + user.getId());
        }
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }
}
