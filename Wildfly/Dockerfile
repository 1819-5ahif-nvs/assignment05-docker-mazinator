FROM ubuntu
EXPOSE 8080 9990

RUN apt-get update
RUN apt-get install -y mysql-client
RUN apt-get install -y openjdk-11-jdk

COPY demo-thorntail.jar /opt/microprofile/microprofile.jar
COPY entrypoint.sh /opt/microprofile/entrypoint.sh

ENV JAVA_TOOL_OPTIONS="-Djava.net.preferIPv4Stack=true -Djava.net.preferIPv4Addresses=true"

CMD ["/opt/microprofile/entrypoint.sh"]