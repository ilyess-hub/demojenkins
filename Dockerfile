FROM maven:3.8.3-openjdk-17-slim AS builder
COPY . .
RUN mvn package spring-boot:repackage -Dmaven.test.skip=true

FROM openjdk:17.0.1-jdk-slim
COPY --from=builder /target/demo-0.0.1-SNAPSHOT.jar /jenkins-demo/demo-0.0.1-SNAPSHOT.jar
WORKDIR /dafl-bff-web
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
