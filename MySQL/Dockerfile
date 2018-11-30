FROM mysql:5
EXPOSE 3306

ENV MYSQL_ROOT_PASSWORD="passme"

COPY setup.sql /docker-entrypoint-initdb.d/