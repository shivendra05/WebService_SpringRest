package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comsumer.StudentConsumer;

@RestController
public class ParentController {
	
	@Autowired
	StudentConsumer consumer;
	
	@GetMapping("/student")
	public String course() {
		return "I am selecting::"+consumer.getNonTechnicalCourses();
	}
}