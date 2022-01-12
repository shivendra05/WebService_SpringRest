package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class EmployeeController {

	@Value("${server.port}")
	String portnumber;
	
	@GetMapping("/name")
	public String getEmployeeName() {
		return "Mohan "+portnumber;
	}
}