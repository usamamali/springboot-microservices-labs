package com.lab.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Lab3ClientsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ClientsServerApplication.class, args);
	}
}
