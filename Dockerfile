FROM hypriot/rpi-java

ADD /target/parser-0.0.1-SNAPSHOT.jar /opt/parser.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/parser.jar"]