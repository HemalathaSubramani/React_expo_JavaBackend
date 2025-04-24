FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar file
COPY target/Mediaerp_Android_App-0.0.1-SNAPSHOT.jar app.jar

# Expose the correct port your Spring app uses (8081)
EXPOSE 8081

# Start the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
