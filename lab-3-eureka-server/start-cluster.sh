#!/bin/bash
cd "$(dirname "$0")"
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=primary" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=secondary" &
mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=tertiary"