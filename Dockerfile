# Install java
FROM ubuntu:latest
RUN apt-get -y update
RUN apt update
RUN apt install default-jdk -y
COPY . .

ADD target/nylunvik.devopsLecture-1.jar nylunvik.devopsLecture-1.jar
ENTRYPOINT ["java","-jar","nylunvik.devopsLecture-1.jar"]
EXPOSE 8008

# Run java file
#RUN javac .\target\nylunvik.devopsLecture-1.jar 
#CMD ["java", "App.java"] 