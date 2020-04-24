package com.notificationapp.smsnotification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SmsSendService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public String send(String phoneNumber, String message) {
        log.info("Start sending SMS");
        log.info("phone: " + phoneNumber);
        log.info("message: " + message);

        return "SMS sent successfully!";
    }
}
