## Spring Cloud Netflix Practice

### Spec

- Java 11
- Spring Boot 2.2.6
- Eureka
- Ribbon

### How to run

1. Build projects using gradle

```
$ cd PROJECT_DIRECTORY
$ gradle bootjar
```

2. Run jar file with specific port

```
$ java -jar -Dserver.port=XXXX build/libs/YYYY.jar
```

3. Open the browser and go to http://localhost:8761 to check the Eureka server dashboard

4. Open the browser and go to http://localhost:8888/client/frontend to check how Ribbon works

