package ru.kolotov.springmvc.springboot.service;

import org.springframework.stereotype.Service;
import ru.kolotov.springmvc.springboot.Dao.UserDaoInterface;
import ru.kolotov.springmvc.springboot.models.User;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    private final UserDaoInterface userDao;

    public UserService(UserDaoInterface userDao){
        this.userDao = userDao;
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.index();
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public void updateUser(Integer id, User user) {
        userDao.update(id, user);
    }
}
