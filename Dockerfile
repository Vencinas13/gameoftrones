FROM openjdk:17-jdk-slim

LABEL org.opencontainers.image.authors="valentin.enicnas.rojas@gmail.com"   

COPY target/gameoftrones-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java","-jar", "app.jar" ]