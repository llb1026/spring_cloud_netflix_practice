package com.example.ribbonserver;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	Environment environment;
	
	private static final Logger LOG = Logger.getLogger(MyController.class.getName());
	
	@GetMapping("/")
	public String health() {
		LOG.log(Level.INFO, "Backend index page");
		return "I'm OK";
	}
	
	@GetMapping("/backend")
	public String backend() {
		LOG.log(Level.INFO, "Called /ribbonserver/backend");
		String serverPort = environment.getProperty("local.server.port");
		return "Hello from Backend! " + "Host: localhost:" + serverPort;
	}
}
