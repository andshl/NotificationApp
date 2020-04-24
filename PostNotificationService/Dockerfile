FROM java:8-jre

ADD ./target/post-notification-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/post-notification-service.jar"]

EXPOSE 8002