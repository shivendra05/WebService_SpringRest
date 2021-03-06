package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Value("${server.port}")
	String port;
	
	@GetMapping("/tech")
	public String getTechnicalCourses() {
		return "c, c++, Java "+port;
	}

	@GetMapping("/nonTech")
	public String getNonTechnicalCourses() {
		return "physics, chemistry, match "+port;
	}

	@GetMapping("/school")
	public String getSchollCourses() {
		return "drawying, ba , bsc "+port;
	}
}