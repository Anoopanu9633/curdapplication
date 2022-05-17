FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar.jar"]
