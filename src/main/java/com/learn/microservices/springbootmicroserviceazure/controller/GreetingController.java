package com.learn.microservices.springbootmicroserviceazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping(value = "greeting/{name}")
	public String sayHello(@PathVariable String name) {
		
		return "Hello "+name+"! Welcome to Azure Webapp Service";
	}
	
}
