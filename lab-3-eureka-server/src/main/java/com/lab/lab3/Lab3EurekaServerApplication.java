package com.lab.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab3EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3EurekaServerApplication.class, args);
	}
}
