FROM openjdk:17
EXPOSE 8080
ADD target/employee-image.jar employee-image.jar
ENTRYPOINT ["java","-jar","/employee-image.jar"]