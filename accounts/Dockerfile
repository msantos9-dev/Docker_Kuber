#Start with a base image containing Java runtime
FROM openjdk:19-jdk-slim as build

#Information around who maintains the image
MAINTAINER 226772

# Add the application's jar to the container
COPY target/Cards-0.0.1-SNAPSHOT.jar Cards-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/Cards-0.0.1-SNAPSHOT.jar"]