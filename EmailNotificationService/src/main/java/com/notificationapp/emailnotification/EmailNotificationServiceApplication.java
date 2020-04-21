package com.notificationapp.emailnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.notificationapp.emailnotification"})
public class EmailNotificationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailNotificationServiceApplication.class, args);
    }
}
