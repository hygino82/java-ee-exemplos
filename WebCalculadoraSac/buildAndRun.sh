#!/bin/sh
mvn clean package && docker build -t br.dev.hygino/WebCalculadoraSac .
docker rm -f WebCalculadoraSac || true && docker run -d -p 9080:9080 -p 9443:9443 --name WebCalculadoraSac br.dev.hygino/WebCalculadoraSac