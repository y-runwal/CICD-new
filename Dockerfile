# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container at /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/myproject.jar

# Make port 8080 available to the world outside this container
EXPOSE 8282

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/myproject.jar"]
