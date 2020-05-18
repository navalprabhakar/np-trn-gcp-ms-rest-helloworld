FROM openjdk:8-jre-alpine
ADD target/np-trn-gcp-ms-rest-helloworld-*.jar app.jar
EXPOSE 18080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
