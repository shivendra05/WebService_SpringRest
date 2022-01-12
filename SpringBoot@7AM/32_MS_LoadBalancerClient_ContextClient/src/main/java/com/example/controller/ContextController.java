package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.QuoteConsumer;

@RestController
public class ContextController {

	@Autowired
	QuoteConsumer consumer;

	@GetMapping("/context")
	public String getContextController() {

		return "CONTEXT OF TIME:: "+consumer.getQuote();
	}
}
