package com.edu.designpatterns.behavioral;


import com.edu.designpatterns.behavioral.observer.NewUserEvent;
import com.edu.designpatterns.behavioral.observer.User;
import com.edu.designpatterns.behavioral.observer.UserRegistrationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class ObserverTest {
    @Autowired
    private UserRegistrationService userRegistrationService;

    @Test
    public void test() {
        final User user = User.builder().userName("myUser").build();
        userRegistrationService.registerUser(user);
    }
}
