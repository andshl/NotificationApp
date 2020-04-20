package com.notificationapp.emailnotification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailSendService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public void send() {
        log.debug("Message sent!");
        System.out.println("Service message sent");
    }
}
