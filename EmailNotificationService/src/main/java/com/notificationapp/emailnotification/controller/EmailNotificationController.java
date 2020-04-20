package com.notificationapp.emailnotification.controller;

import com.notificationapp.emailnotification.service.EmailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailNotificationController {

    @Autowired
    private EmailSendService emailSendService;

    @GetMapping
    public void getEmailNotification() {
        emailSendService.send();
    }
}
