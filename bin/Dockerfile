<<<<<<< HEAD
<<<<<<<< HEAD:bin/Dockerfile
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar"]
========
FROM openjdk:11
ARG JAR_FILE=target/*.jar
ADD target/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar"]
>>>>>>>> d631f105794b6c0115e767bce26ca959dbe574d5:Dockerfile
=======
FROM openjdk:11
EXPOSE 8080
ADD target/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", ","/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar"]
>>>>>>> d631f105794b6c0115e767bce26ca959dbe574d5
