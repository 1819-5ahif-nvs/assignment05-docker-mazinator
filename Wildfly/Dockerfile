FROM ubuntu
EXPOSE 8080 9990

RUN apt-get update
RUN apt-get install -y mysql-client
RUN apt-get install -y openjdk-11-jdk

COPY target/microprofile-thorntail.jar /opt/microprofile/microprofile.jar