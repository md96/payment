# Use OpenJDK image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/payment-0.0.1-SNAPSHOT.jar app.jar

# Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]