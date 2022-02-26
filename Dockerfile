FROM openjdk:11

COPY ["./target/history-0.0.1-SNAPSHOT.jar", "/usr/app/"]

CMD ["java", "-jar", "/usr/app/history-0.0.1-SNAPSHOT.jar"]

EXPOSE 8086