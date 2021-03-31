FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR opt/stock_quote_manager

COPY /target/stock-quote-manager-0.0.1-SNAPSHOT.jar stock_quote_manager.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8081

CMD java ${ADDITIONAL_OPTS} -jar stock_quote_manager.jar --spring.profiles.active=${PROFILE}
