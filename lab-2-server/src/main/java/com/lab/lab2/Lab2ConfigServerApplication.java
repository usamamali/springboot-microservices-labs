package com.lab.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Lab2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab2ConfigServerApplication.class, args);
	}
}
