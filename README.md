#### Описание

Приложение `NotificationApp` состоит из следующих сервисов:
* `Registry` - сервис для регистрации сервисов. Реализован с помощью `Netflix Eureka`. 
* `Gateway` - точка входа в приложение. Сервис маршрутизации запросов на сервисы нотификации. Реализован с помощью `Netflix Zuul`.
* `EmailNotificationService` - сервис отправки сообщений по Email.
* `SmsNotificationService` - сервис отправки сообщений по SMS (не реализован).
* `PostNotificationService` - сервис отправки сообщений по почте (не реализован).

#### Эндпоинты
- http://localhost:8079 - Gateway
- http://localhost:8761 - Eureka Dashboard
- http://localhost:8000/email-service/email - EmailNotificationService

#### EmailNotificationService

Метод: `GET`  
Путь: `email-service/email`  
Параметры: 
 * `from` - email отправителя
 * `to` - email получателя
 * `subject` - тема письма (не обязательный)
 * `text` - текст письма (не обязательный)

Запрос на Gateway с маршрутизацией в EmailNotificationService:  
`curl -X GET "http://localhost:8079/email-service/email?from=test@mail.ru&to=test2@mail.ru&&subject=Message&msg=new"`

Запрос на EmailNotificationService:  
`curl -X GET "http://localhost:8000/email-service/email?from=test@mail.ru&to=test2@mail.ru&&subject=Message&msg=new"`

Информация пишется в лог контейнера. На запрос `curl` возвращается `Email sent successfully!`.

#### Деплой

1) Собрать артефакты командой `mvn package`
2) Запустить контейнеры командой `docker-compose -f docker-compose.yml up --build -d`
3) Дождаться запуска контейнеров, старта приложений в них.