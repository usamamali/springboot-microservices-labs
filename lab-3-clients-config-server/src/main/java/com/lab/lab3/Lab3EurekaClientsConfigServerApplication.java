package com.lab.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class Lab3EurekaClientsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3EurekaClientsConfigServerApplication.class, args);
	}
}
