FROM openjdk:8
EXPOSE 8480
ADD target/github-jenkins-docker-integration.jar github-jenkins-docker-integration.jar
ENTRYPOINT ["java", "-jar", "/github-jenkins-docker-integration.jar"]