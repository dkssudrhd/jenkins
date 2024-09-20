FROM eclipse-temurin:17-jre

WORKDIR /test

COPY target/jenkins-0.0.1-SNAPSHOT.jar /test/jenkins.jar

EXPOSE 8080

CMD ["java", "-jar", "/test/jenkins.jar"]