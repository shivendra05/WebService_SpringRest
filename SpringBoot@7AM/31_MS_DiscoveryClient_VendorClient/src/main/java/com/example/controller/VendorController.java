package com.example.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class VendorController {

	@GetMapping("/vendor")
	public String createController() {
		return "WE SUPPLY ALL ELECTRONICS PRODUCT";
	}
}
