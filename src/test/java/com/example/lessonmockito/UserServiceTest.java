package com.example.lessonmockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserService service;
    @Mock
    private UserDaoImpl userDao;

    @Test
    public void checkUserExist() {
        Mockito.when(userDao.getUserByName("Olga")).thenReturn(new User("Olga"));
        boolean isUserExist = service.checkUserExist(new User("Olga"));
        Assertions.assertTrue(isUserExist);

    }

    @Test
    public void checkUserNotExist() {
        boolean isAnotherUserExists = service.checkUserExist(new User("Olga"));
        Assertions.assertFalse(isAnotherUserExists);
    }
}
