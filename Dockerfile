FROM openjdk:11
EXPOSE 8080
ADD target/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar"]

#ADD target/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
