package core.jdbs.service;

import core.jdbs.dao.UserDao;
import core.jdbs.dao.UserDaoHibernateImpl;
import core.jdbs.dao.UserDaoJDBSImpl;
import core.jdbs.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService{


    private UserDao userDao = new UserDaoJDBSImpl();

    public UserServiceImpl() {};


    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
