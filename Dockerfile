# Use the official OpenJDK as a parent image
FROM openjdk:17-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/your-application.jar /app/sdmanager.jar

# Specify the command to run your application
CMD ["java", "-jar", "sdmanager.jar"]



# Next step will be to Build the Docker Image:
# Open a terminal and navigate to your project directory.
# Run this command to build the Docker image: : - docker build -t sdmanager

# Next step will be to run the Docker Container:
# Once the image is built, you can run a container from it:
# docker run -p 8080:8080 sdmanager