package core.jdbs;
import java.sql.*;
import core.jdbs.service.UserService;
import core.jdbs.service.UserServiceImpl;
import core.jdbs.model.User;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {



        UserService userService = new UserServiceImpl();

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




    }
}