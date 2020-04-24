package com.notificationapp.postnotification.service;

import com.notificationapp.postnotification.entity.PostEnvelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PostEnvelopeSendService {

    private Logger log = LoggerFactory.getLogger(getClass());

    public String send(PostEnvelope envelope) {
        log.info("Start sending envelope!");
        log.info("indexFrom: " + envelope.getIndexFrom());
        log.info("addressFrom: " + envelope.getAddressFrom());
        log.info("indexTo: " + envelope.getIndexTo());
        log.info("addressTo: " + envelope.getAddressTo());
        log.info("trackingNumber: " + envelope.getTrackingNumber());
        log.info("message: " + envelope.getText());

        return "Envelope sent successfully!";
    }
}
