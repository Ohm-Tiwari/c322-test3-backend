FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/ducks-service-0.0.1-SNAPSHOT.jar test3.jar
ENTRYPOINT ["java", "-jar", "test3.jar"]