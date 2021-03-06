package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.CompanyConsumer;

@RestController
@EnableEurekaClient
public class CompanyController {

	@Autowired
	CompanyConsumer consumer;
	
	@GetMapping("/company")
	public String compController() {
		return "THIS IS OM ELECTRONICS "+consumer.vendorConsume();
	}
}
