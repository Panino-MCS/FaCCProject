# Linux image used
FROM alpine
WORKDIR /root/game
COPY Player.java /root/game
COPY Game.java /root/game

# Install JDK
RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

# Compile Game
RUN javac Game.java

ENTRYPOINT java Game
