package org.example.service;

import java.util.List;

import org.example.dao.UserDaoJDBCImpl;
import org.example.model.User;

public class UserServiceImpl implements UserService {
    private UserDaoJDBCImpl userDaoJDBCImpl = new UserDaoJDBCImpl();
    public void createUsersTable() {
        userDaoJDBCImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBCImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBCImpl.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoJDBCImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoJDBCImpl.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoJDBCImpl.cleanUsersTable();
    }
}
