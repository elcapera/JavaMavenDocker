FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY deploy/app-*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
