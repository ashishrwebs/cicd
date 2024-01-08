FROM openjdk:17
EXPOSE 8080
ADD target/mavendemo_cicd.jar mavendemo_cicd.jar
ENTRYPOINT ["java","-jar","/mavendemo_cicd.jar"]