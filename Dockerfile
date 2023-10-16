FROM ubuntu:latest AS build

RUN apt-get update
Run apt-get install openjdk-17-jdk -y install

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

EXPOSE 8080

COPY --from=build /target/todolist-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]