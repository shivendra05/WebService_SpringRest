package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteConctroller {
	
	@GetMapping("/quote")
	public String getQuote() {
		
		return "THE SOONER THE BETTER";
	}
}
