#!/bin/bash
#docker build -t payment 
& "C:\Program Files (x86)\Docker\Docker\resources\bin\docker.exe" build -t payment .
#docker run -d -p 8080:8080 payment
& "C:\Program Files (x86)\Docker\Docker\resources\bin\docker.exe" docker run -d -p 8080:8080 payment