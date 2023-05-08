package com.example.lessonmockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserDaoTest {

    private final UserDao dao = new UserDaoImpl();


    @Test
    public void testGetUserByName() {
        User user = dao.getUserByName("Sasha");

        Assertions.assertEquals("Sasha",user.getName());
    }

    @Test
    public void testGetNotExistUser(){
        User user = dao.getUserByName("Andrey");

        Assertions.assertNull(user);
    }

}
