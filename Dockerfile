FROM openjdk:8-jdk-alpine
ARG JAR_FILE=C:\ProgramData\Jenkins\.jenkins\workspace\projectpipeline\assesmentfile\target\springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]
