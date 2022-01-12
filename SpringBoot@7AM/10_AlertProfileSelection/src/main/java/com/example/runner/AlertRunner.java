package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.alert.AlertService;

@Component
public class AlertRunner implements CommandLineRunner {
	
	@Autowired
	AlertService service;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello");
		service.getAlert();
	}
}