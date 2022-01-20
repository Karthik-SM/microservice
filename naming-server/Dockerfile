FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8761
ADD target/*.jar naming-server.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /naming-server.jar" ]           