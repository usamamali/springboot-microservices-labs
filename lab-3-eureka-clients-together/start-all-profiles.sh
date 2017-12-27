#!/bin/bash
cd "$(dirname "$0")"
export M2_HOME=/Users/usama/tools/apache-maven-3.3.9/
export PATH=$PATH:$M2_HOME/bin
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=subject" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=verb" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=article" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=adjective" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=noun" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=sentence"
