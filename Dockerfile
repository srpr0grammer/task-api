FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the application jar file to the container
COPY target/task-api.jar /app/task-api.jar

# Set the command to run the jar file
CMD ["java", "-jar", "task-api.jar"]