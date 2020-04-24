package com.notificationapp.postnotification.entity;

public class PostEnvelope {
    private String addressFrom;
    private String addressTo;
    private String indexFrom;
    private String indexTo;
    private String trackingNumber;
    private String text;

    public String getAddressFrom() {
        return addressFrom;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public String getIndexFrom() {
        return indexFrom;
    }

    public String getIndexTo() {
        return indexTo;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getText() {
        return text;
    }
}
