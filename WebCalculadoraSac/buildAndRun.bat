@echo off
call mvn clean package
call docker build -t br.dev.hygino/WebCalculadoraSac .
call docker rm -f WebCalculadoraSac
call docker run -d -p 9080:9080 -p 9443:9443 --name WebCalculadoraSac br.dev.hygino/WebCalculadoraSac