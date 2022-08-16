FROM openjdk:18
WORKDIR /app
COPY /target/springboot-docker-postgres-0.0.1-SNAPSHOT.jar customer-service.jar
ENTRYPOINT ["java", "-jar", "customer-service.jar"]
EXPOSE 8888