package com.edu.designpatterns.behavioral.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void registerUser(final User user) {

        // Write your own business logic
        applicationEventPublisher.publishEvent(new NewUserEvent(this, user));

    }
}
