FROM openjdk:14-alpine
COPY target/micronaut-jdbc-test1-*.jar micronaut-jdbc-test1.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-jdbc-test1.jar"]