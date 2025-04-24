# Use Maven to build the app first
FROM maven:3.9.3-eclipse-temurin-17 AS build

WORKDIR /app

# Copy all files and build the JAR
COPY . .
RUN mvn clean package -DskipTests

# Use a slim JDK to run the app
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the JAR from the previous stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]

