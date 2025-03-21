FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . .
RUN ./gradlew bootJar --no-daemon

FROM eclipse-temurin:21

EXPOSE 8080

RUN mkdir /app
COPY --from=build /build/libs/*.jar /app/project_service.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar","/app/project_service.jar"]