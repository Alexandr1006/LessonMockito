package com.example.lessonmockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Sasha"),
                new User("Pasha")
        );
    }

    public User getUserByName(String name){
        for(User user : users){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public List<User> findAllUsers(){return users;}
}
