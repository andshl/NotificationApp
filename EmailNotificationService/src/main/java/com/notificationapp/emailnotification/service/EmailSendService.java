package com.notificationapp.emailnotification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailSendService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public String send(String from, String to, String subject, String message) {
        log.info("Start sending email");
        log.info("from: " + from);
        log.info("to: " + to);
        log.info("subject: " + subject);
        log.info("message: " + message);

        return "Email sent successfully!";
    }
}
