# Use OpenJDK 17 base image
FROM eclipse-temurin:17-jdk-jammy


# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java","-jar","app.jar"]
