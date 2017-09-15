#!/usr/bin/env bash

mvn -f pom.xml clean package -Plocal -U

cp /target/java-redis-standalone-server.jar redis-standalone.jar
