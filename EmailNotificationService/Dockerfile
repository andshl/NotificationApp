FROM java:8-jre

ADD ./target/email-notification-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/email-notification-service.jar"]

EXPOSE 8000
