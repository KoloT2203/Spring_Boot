package ru.kolotov.springmvc.springboot.Dao;

import ru.kolotov.springmvc.springboot.models.User;
import java.util.List;

public interface UserDaoInterface {
    List<User> index();
    User getUserById(Integer id);
    void save(User user);
    void update(Integer id, User updateUser);
    void deleteById(Integer id);
}
