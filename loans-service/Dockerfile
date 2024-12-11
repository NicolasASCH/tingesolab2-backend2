FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} loans-service.jar
ENTRYPOINT ["java", "-jar", "/loans-service.jar"]