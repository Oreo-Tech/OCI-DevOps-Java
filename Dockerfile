FROM openjdk:17-alpine

# following https://nodejs.org/en/docs/guides/nodejs-docker-webapp/

WORKDIR /usr/src/OCI-DevOps-Java

RUN apk add maven


# Bundle app source
COPY . .

Run mvn clean install