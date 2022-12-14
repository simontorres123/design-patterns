package com.edu.designpatterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService implements INotificationService {

    @Override
    public void sendUserRegisteredNotification(final User user) {
        log.info("Implement your own business logic for sending mail to user");
    }
}
