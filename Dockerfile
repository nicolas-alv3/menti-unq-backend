#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# run stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/menti-unq-0.0.1-SNAPSHOT.jar /usr/local/lib/app.jar
EXPOSE 8080
CMD ["java","-jar","/usr/local/lib/app.jar"]