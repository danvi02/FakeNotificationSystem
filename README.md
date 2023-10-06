# Project: Fake Notification System

## Description

This project demonstrates the evolution of a Notification System developed in Java, progressively transformed into Spring-based applications. The project advances through different stages:

## Step 1: Develop Notification System in Plain Java

This step involves creating a basic Notification System using core Java.

## Step 2: Convert the Java Application to Spring Core

In this step, the Java Notification System is converted into a Spring Core application. The migration involves the following stages:

- 🌱 **Migration to Spring Core:** The application logic is refactored to utilize Spring Core features, including dependency injection and bean configuration.

## Step 3: Convert the Spring Core Application to Spring Web

In this step, the Spring Core application is transformed into a Spring Web application, implementing various combinations of controllers and responses:

- 🌐 **@Controller + @ResponseBody:** Controllers are annotated with `@Controller` and `@ResponseBody` to write responses directly to the HTTP protocol.
- 🌐 **@Controller + ResponseEntity:** Controllers return `ResponseEntity` objects from API methods, allowing fine-grained control over the HTTP response.
- 🌐 **@RestController:** Controllers are annotated with `@RestController`, a combination of `@Controller` and `@ResponseBody`, simplifying the process of writing responses.

## Step 4: Convert the Spring Web Application to Spring Boot

In this final step, the Spring Web application is converted into a Spring Boot application, enhancing simplicity and reducing configuration overhead.

- 🚀 **Migration to Spring Boot:** The application is refactored to use Spring Boot, leveraging its auto-configuration and opinionated defaults to simplify the setup and deployment process.

## How to Run the Application

To run the Notification System at each step, follow these steps:

1. **Step 1 - Plain Java:**
   - Compile and run the Java files using a Java compiler and interpreter.

2. **Step 2 - Spring Core:**
   - Update the application to use Spring Core. Configure Spring beans and dependencies.
   - Build and run the application using Maven or Gradle.

3. **Step 3 - Spring Web:**
   - Implement controllers based on the specified combinations (`@Controller + @ResponseBody`, `@Controller + ResponseEntity`, `@RestController`).
   - Build and run the Spring Web application and add the application in Tomcat server manually and start the server and hit the URL.

4. **Step 4 - Spring Boot:**
   - Refactor the application to a Spring Boot project, ensuring the necessary dependencies are included in the `pom.xml` file.
   - Run the Spring Boot application using the `mvn spring-boot:run` command.
