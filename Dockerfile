FROM openjdk:11
EXPOSE 8086
#WORKDIR /app
WORKDIR /usr/src/app

COPY . .
#COPY target/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar .
#Add target/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
CMD  ["java", "-jar", "/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-jar", "/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar"]

#ADD target/springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar springboot-curd-restful-webservices-0.0.1-SNAPSHOT.jar
