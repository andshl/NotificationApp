package com.notificationapp.emailnotification.controller;

import com.notificationapp.emailnotification.service.EmailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailNotificationController {

    private final EmailSendService emailSendService;

    @Autowired
    public EmailNotificationController(EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }

    @RequestMapping(value = "notification/email")
    public String getEmailNotification() {
        System.out.println("Controller");
        emailSendService.send();
        return "Return from controller!";
    }
}
