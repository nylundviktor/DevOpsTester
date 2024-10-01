# Install java
FROM ubuntu:latest
RUN apt-get -y update
RUN apt update
RUN apt install default-jdk -y
COPY . .

# Run java file
RUN javac .\target\nylunvikdevopsLecture-1.jar 
CMD ["java", "App.java"] 