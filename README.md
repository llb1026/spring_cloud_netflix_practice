## Spring Cloud Netflix Practice

### Spec

- Java 11
- Spring Boot 2.2.6
- Eureka
- Ribbon
- Swagger 2
- Sleuth
- Zipkin

### How to run

1. Build projects using gradle

```
$ cd PROJECT_DIRECTORY
$ gradle bootjar
```

2. Run jar file with specific port

```
// ============ Port Info =============
// eureka-server: 8761
// zuul-application: 8762
// zipkin-server: 9411
// ribbon-client: 8888
// ribbon-server: 9090, 9091, 9092 ...
// ====================================
$ java -jar -Dserver.port=XXXX build/libs/YYYY.jar
```

3. Open the browser and go to http://localhost:8761 to check the Eureka server dashboard

4. Open the browser and go to http://localhost:8762 to check all the routes that Zuul can use according to the Eureka

5. Open the browser and go to http://localhost:8888/frontend to check how Ribbon works

6. Open the browser and go to http://localhost:8762/ribbonclient/frontend to check how Zuul routes request

7. Open the browser and go to http://localhost:8888/swagger-ui.html to check the swagger dashboard for ribbon-client

8. Open the browser and go to http://localhost:9411/zipkin/ to check the Zipkin server dashboard

