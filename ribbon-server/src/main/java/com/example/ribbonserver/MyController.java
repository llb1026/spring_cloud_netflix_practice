package com.example.ribbonserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	Environment environment;
	
	@GetMapping("/")
	public String health() {
		return "I'm OK";
	}
	
	@GetMapping("/backend")
	public String backend() {
		System.out.println("Backend MyController...");
		String serverPort = environment.getProperty("local.server.port");
		System.out.println("Port: " + serverPort);
		return "Hello from Backend! " + "Host: localhost:" + serverPort;
	}
}
