#### Описание

Приложение `NotificationApp` состоит из следующих сервисов:
* `Registry` - сервис для регистрации сервисов. Реализован с помощью `Netflix Eureka`. 
* `Gateway` - точка входа в приложение. Сервис маршрутизации запросов на сервисы нотификации. Реализован с помощью `Netflix Zuul`.
* `EmailNotificationService` - сервис отправки сообщений по Email.
* `SmsNotificationService` - сервис отправки сообщений по SMS.
* `PostNotificationService` - сервис отправки сообщений по почте.

#### Эндпоинты
- http://localhost:8079 - Gateway
- http://localhost:8761 - Eureka Dashboard
- http://localhost:8000/email-service/email - EmailNotificationService
- http://localhost:8001/sms-service/sms - SmsNotificationService
- http://localhost:8002/post-service/envelope - PostNotificationService

#### EmailNotificationService

Метод: `GET`  
Путь: `email-service/email`  
Параметры: 
 * `from` - email отправителя
 * `to` - email получателя
 * `subject` - тема письма (не обязательный)
 * `msg` - текст письма (не обязательный)

Запрос на Gateway с маршрутизацией в EmailNotificationService:  
`curl -X GET "http://localhost:8079/email-service/email?from=test@mail.ru&to=test2@mail.ru&&subject=Message&msg=new"`

Запрос на EmailNotificationService:  
`curl -X GET "http://localhost:8000/email-service/email?from=test@mail.ru&to=test2@mail.ru&&subject=Message&msg=new"`

Информация пишется в лог контейнера. На запрос `curl` возвращается `Email sent successfully!`.

#### SmsNotificationService

Метод: `GET`  
Путь: `sms-service/sms/{phone}/{msg}`  
Параметры: 
 * `phone` - телефон получателя
 * `msg` - текст сообщения

Запрос на Gateway с маршрутизацией в SmsNotificationService:  
`curl -X GET "http://localhost:8079/sms-service/sms/89997776655/new"`

Запрос на SmsNotificationService:  
`curl -X GET "http://localhost:8001/sms-service/sms/89997776655/new"`

Информация пишется в лог контейнера. На запрос `curl` возвращается `SMS sent successfully!`.

#### PostNotificationService

Метод: `POST`  
Путь: `post-service/envelope`  
Параметры JSON: 
 * `indexFrom` - индекс отправителя
 * `indexTo` - индекс получателя
 * `addressFrom` - адрес отправителя
 * `addressTo` - адрес получателя
 * `trackingNumber` - номер отслеживания
 * `text` - текст письма

Запрос на Gateway с маршрутизацией в PostNotificationService:  
`curl -X POST "http://localhost:8079/post-service/envelope" -H "Content-type:application/json;charset=utf-8" -d "{\"indexFrom\": \"410000\", \"addressFrom\": \"Moskovskaya street, 1\", \"indexTo\": \"410001\", \"addressTo\": \"Astrakhanskaya street, 2\", \"trackingNumber\": \"2365t81327d\", \"text\": \"Hello\"}"`

Запрос на PostNotificationService:  
`curl -X POST "http://localhost:8002/post-service/envelope" -H "Content-type:application/json;charset=utf-8" -d "{\"indexFrom\": \"410000\", \"addressFrom\": \"Moskovskaya street, 1\", \"indexTo\": \"410001\", \"addressTo\": \"Astrakhanskaya street, 2\", \"trackingNumber\": \"2365t81327d\", \"text\": \"Hello\"}"`

Информация пишется в лог контейнера. На запрос `curl` возвращается `Envelope sent successfully!`.

#### Деплой

1) Собрать артефакты командой `mvn package`
2) Запустить контейнеры командой `docker-compose -f docker-compose.yml up --build -d`
3) Дождаться запуска контейнеров, старта приложений в них.