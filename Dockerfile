FROM openjdk:21-jdk-slim
WORKDIR /offside
COPY target/offsideAi-0.0.1-SNAPSHOT.jar offside.jar
EXPOSE 8080
CMD ["java", "-jar","offside.jar"]
