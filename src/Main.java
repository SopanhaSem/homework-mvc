import controller.UserController;
import model.User;
import model.dto.UserDto;

public class Main {
    public static void main(String[] args) {
        // I create user controller object
        UserController userController = new UserController();
        // I add 2 user to UserDto
        userController.addNewUsers(new UserDto("Alice", "alice@example.com"));
        userController.addNewUsers(new UserDto("Bob", "bob@example.com"));
        // delete user
        userController.deleteUserById(1);
        // update user
        userController.updateUser(new User(2,"queen","kk@gmail.com"));
        // I show all Users
        System.out.println("All users:");
        userController.getAllUsers().forEach(System.out::println);
    }
}