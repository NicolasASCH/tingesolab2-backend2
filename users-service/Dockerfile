FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} users-service.jar
ENTRYPOINT ["java", "-jar", "/users-service.jar"]