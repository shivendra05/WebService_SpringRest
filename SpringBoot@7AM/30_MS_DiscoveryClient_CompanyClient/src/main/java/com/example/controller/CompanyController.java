package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.CourseConsumer;

@RestController
@EnableEurekaClient
public class CompanyController {

	@Autowired
	CourseConsumer consumer;
	
	@GetMapping("/company")
	public String companyController() {
		return "YOU'R IN IVY "+consumer.getCourse();
	}
}
