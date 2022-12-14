package com.edu.designpatterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserSynchronizationService implements IUserSynchronizationService {

    @Override
    public void synchronizeWithExternalServices(final User user) {

        log.info("Implement your own business logic for synchronization");

    }
}
