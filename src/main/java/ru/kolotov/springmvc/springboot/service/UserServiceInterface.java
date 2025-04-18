package ru.kolotov.springmvc.springboot.service;

import ru.kolotov.springmvc.springboot.models.User;

import java.util.List;

public interface UserServiceInterface {
    void createUser(User user);
    List<User> getAllUsers();
    User getUserById(Integer id);
    void deleteUserById(Integer id);
    void updateUser(Integer id, User user);
}
