FROM openjdk:17-jdk-slim

LABEL org.opencontainers.image.authors="valentin.enicnas.rojas@gmail.com"   

# The application's jar file
ARG JAR_FILE    

RUN echo ${JAR_FILE}                                           

# Add the application's jar to the container
COPY target/${JAR_FILE} /app.jar       

ENTRYPOINT [ "java","-jar", "/app.jar" ]