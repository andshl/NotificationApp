package com.notificationapp.smsnotification.controller;

import com.notificationapp.smsnotification.service.SmsSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SmsNotificationController {

    private final SmsSendService smsSendService;

    @Autowired
    public SmsNotificationController(SmsSendService smsSendService) {
        this.smsSendService = smsSendService;
    }

    @RequestMapping(value = "/sms/{phone}/{msg}", method = RequestMethod.GET)
    public String getSmsNotification(@PathVariable("phone") String phoneNumber, @PathVariable("msg") String message) {
        return smsSendService.send(phoneNumber, message);
    }
}
