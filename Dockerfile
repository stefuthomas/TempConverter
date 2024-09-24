FROM maven:latest

LABEL authors="stefu"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "-jar", "target/TempConverter.jar"]