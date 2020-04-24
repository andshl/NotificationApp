FROM java:8-jre

ADD ./target/sms-notification-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/sms-notification-service.jar"]

EXPOSE 8001