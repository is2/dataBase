package core.jdbs;
import java.sql.*;
import core.jdbs.service.UserService;
import core.jdbs.service.UserServiceImpl;
import core.jdbs.model.User;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {



        UserService userService = new UserServiceImpl(false);

        userService.createUsersTable();

        userService.saveUser("A", "A", (byte) 30);
        userService.saveUser("B", "B", (byte) 25);
        userService.saveUser("C", "C", (byte) 35);
        userService.saveUser("D", "D", (byte) 40);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();



        UserServiceImpl userService1 = new UserServiceImpl(true);

        userService1.createUsersTable();
        userService1.saveUser("A", "A", (byte) 25);
        userService1.saveUser("B", "B", (byte) 30);
        userService1.saveUser("C", "C", (byte) 25);
        userService1.saveUser("D", "D", (byte) 30);
        System.out.println("Users in database:");
        for (User user : userService1.getAllUsers()) {
            System.out.println(user);
        }
        userService1.cleanUsersTable();
        userService1.dropUsersTable();
    }
}