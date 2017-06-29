package com.lab.lab3.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/sentence")
	public @ResponseBody String getSentence() {
		return getWord("LAB-3-EUREKA-CLIENT-SUBJECT") + " " + getWord("LAB-3-EUREKA-CLIENT-VERB") + " "
				+ getWord("LAB-3-EUREKA-CLIENT-ARTICLE") + " " + getWord("LAB-3-EUREKA-CLIENT-ADJECTIVE") + " "
				+ getWord("LAB-3-EUREKA-CLIENT-NOUN") + ".";
	}

	public String getWord(String service) {
		List<ServiceInstance> list = discoveryClient.getInstances(service);
		if (list != null && list.size() > 0) {
			URI uri = list.get(0).getUri();
			if (uri != null) {
				return (new RestTemplate()).getForObject(uri, String.class);
			}
		}
		return null;
	}

}
