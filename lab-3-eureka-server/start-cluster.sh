#!/bin/bash
cd "$(dirname "$0")"
export M2_HOME=/Users/usama/tools/apache-maven-3.3.9/
export PATH=$PATH:$M2_HOME/bin
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=primary" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=secondary" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=tertiary"