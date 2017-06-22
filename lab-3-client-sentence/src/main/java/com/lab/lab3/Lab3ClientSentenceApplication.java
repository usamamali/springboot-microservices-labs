package com.lab.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab3ClientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ClientSentenceApplication.class, args);
	}
}
