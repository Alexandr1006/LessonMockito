package com.example.lessonmockito;

import java.util.List;

public interface UserDao {

    User getUserByName(String name);

    List<User> findAllUsers();
}
