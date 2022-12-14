package com.edu.designpatterns.behavioral.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserExternalSynchronizationHandler {

    @Autowired
    private IUserSynchronizationService userSynchronizationService;

    @EventListener
    public void handleNewUser(final NewUserEvent newUserEvent) {
        userSynchronizationService.synchronizeWithExternalServices(newUserEvent.getUser());
    }
}
