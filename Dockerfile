FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 5000
COPY target/demo-0.0.1-SNAPSHOT.jar spring-demo.jar
ENTRYPOINT ["java","-jar","/spring-demo.jar"]