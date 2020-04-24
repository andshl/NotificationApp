package com.notificationapp.postnotification.controller;

import com.notificationapp.postnotification.entity.PostEnvelope;
import com.notificationapp.postnotification.service.PostEnvelopeSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostNotificationController {

    private final PostEnvelopeSendService postEnvelopeSendService;

    @Autowired
    public PostNotificationController(PostEnvelopeSendService postEnvelopeSendService) {
        this.postEnvelopeSendService = postEnvelopeSendService;
    }

    @PostMapping("/envelope")
    public String getPostNotification(@RequestBody PostEnvelope envelope) {
        return postEnvelopeSendService.send(envelope);
    }
}
