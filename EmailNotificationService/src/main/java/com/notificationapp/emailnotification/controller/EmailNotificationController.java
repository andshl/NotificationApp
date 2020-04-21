package com.notificationapp.emailnotification.controller;

import com.notificationapp.emailnotification.service.EmailSendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailNotificationController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final EmailSendService emailSendService;

    @Autowired
    public EmailNotificationController(EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }

    @GetMapping("/email")
    public String getEmailNotification() {
        log.debug("Message sent!");
        System.out.println("Service message sent");
        System.out.println("Controller ");
        //emailSendService.send();
        return "Return from controller! ";
    }
}
