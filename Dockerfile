# Use official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set a working directory inside the container
WORKDIR /app

# Copy the jar file from your local machine into the container
COPY target/payment-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app listens on (example 8080)
EXPOSE 808

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]