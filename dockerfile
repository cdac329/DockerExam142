FROM openjdk:17-jdk-slim
WORKDIR /src
COPY . . 
RUN javac Largest4Number.java
CMD java Largest4Number