package com.notificationapp.emailnotification.controller;

import com.notificationapp.emailnotification.service.EmailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailNotificationController {

    private final EmailSendService emailSendService;

    @Autowired
    public EmailNotificationController(EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }

    @RequestMapping(value = "/email", method=RequestMethod.GET)
    public String getEmailNotification(@RequestParam(value = "from") String from, @RequestParam(value = "subject", required = false) String subject, @RequestParam(value = "to") String to, @RequestParam(value = "msg", required = false) String message) {
        return emailSendService.send(from, to, subject, message);
    }
}
