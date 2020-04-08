package com.example.ribbonclient;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	private static final Logger LOG = Logger.getLogger(MyController.class.getName());
	
	@RequestMapping("/frontend")
	public String hi() {
		LOG.log(Level.INFO, "Calling /ribbonserver/backend");
		String randomString = this.restTemplate.getForObject("http://ribbonserver/backend", String.class);
		return "Server Response: " + randomString;
	}
}
