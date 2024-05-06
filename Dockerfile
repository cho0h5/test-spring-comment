FROM openjdk:17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "test-comment-0.0.1-SNAPSHOT.jar"]
