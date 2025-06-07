#!/bin/bash

docker build -t payment .
docker run -d -p 8080:8080 payment