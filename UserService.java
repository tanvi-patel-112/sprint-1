package com.demo.Service;

import java.util.List;

import com.demo.Online_Food_System.Entity.User;

public interface UserService {
    User createUser(User user);
    User getUser(int userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(int userId);
}
