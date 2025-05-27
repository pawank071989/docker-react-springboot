FROM gradle:8.7-jdk17 AS build

WORKDIR /app

# Copy only required files first to leverage Docker cache
COPY gradlew .
COPY gradle gradle

# Make gradlew executable
RUN chmod +x gradlew

# Now copy the rest of the source code
COPY . .

# Build the Spring Boot JAR
RUN ./gradlew clean bootJar

# Step 2: Run the JAR in a new layer with a smaller base image for reduced image size
FROM eclipse-temurin:17-jre-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Set the location of the JAR
ARG JAR_FILE=/app/build/libs/*.jar

# Copy the JAR from the build stage
COPY --from=build ${JAR_FILE} app.jar

# Run the JAR
ENTRYPOINT ["java","-jar","/app.jar"]