package com.learn.microservices.springbootmicroserviceazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping(value = "/")
	public String sayHello() {
		
		return "Hello! Welcome to Azure Webapp Service";
	}
	
}
