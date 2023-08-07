# Alfresco Java SDK - Sample

Sample application to demonstrate both event handling usage within a sample extension.

It is a Spring Boot application that makes use of [Alfresco Java Event API Spring Boot Starter](https://github.com/Alfresco/alfresco-java-sdk/tree/develop/alfresco-java-event-api#spring-boot-custom-starter) to define a sample [```EventHandler```](https://github.com/Alfresco/alfresco-java-sdk/blob/develop/alfresco-java-event-api/alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/EventHandler.java)

## Usage

### Pre-Requisites

To properly build and run the project in a local environment it is required to have installed some tools.

* Java 11:
```bash
$ java -version

openjdk version "11.0.1" 2018-10-16
OpenJDK Runtime Environment 18.9 (build 11.0.1+13)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.1+13, mixed mode)
```

* [Maven](https://maven.apache.org/install.html) version 3.3 or higher:
```bash
$ mvn -version

Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T21:00:29+02:00)
```

### How to Build

Build the library using default maven command.

```bash
$ mvn clean package
```

#### How To Run

Verify that any of the Docker Compose with ActiveMQ enabled and Repository producing `alfresco.repo.event2` messages is running.

Run this project as a regular Spring Boot application.

```bash
$ java -jar target/alfresco-java-sdk-sample-5.2.0.jar
```