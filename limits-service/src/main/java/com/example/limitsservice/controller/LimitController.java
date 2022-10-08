package com.example.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	@Autowired
	private Configuration config;
	
	
	@GetMapping("/limits")
	public Limits retrieveLimit() {
		
		return new Limits(config.getMinimum(),config.getMaximum());
	}
	
	
}
