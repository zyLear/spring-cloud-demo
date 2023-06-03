FROM openjdk:8
LABEL authors="zylear"
MAINTAINER zylear <284449710@qq.com>
ARG JAR_FILE=could-register.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=server1","/app.jar"]