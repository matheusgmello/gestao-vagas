FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app
COPY . .

RUN mvn clean install -DskipTests

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
EXPOSE 8080

COPY --from=build /app/target/gestao_vagas-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
