#start from openjdk image
# Use a slim version of OpenJDK 17
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/A-user-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8085

# Run the application
ENTRYPOINT [ "java","-jar","app.jar" ]