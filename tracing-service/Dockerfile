FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} tracing-service.jar
ENTRYPOINT ["java", "-jar", "/tracing-service.jar"]