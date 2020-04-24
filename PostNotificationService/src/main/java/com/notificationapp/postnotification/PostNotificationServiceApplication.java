package com.notificationapp.postnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PostNotificationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostNotificationServiceApplication.class, args);
    }
}
