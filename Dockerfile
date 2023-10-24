FROM openjdk:11.0.16
# FROM openjdk
VOLUME /tmp
COPY target/demo-0.0.1-SNAPSHOT.jar /app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
