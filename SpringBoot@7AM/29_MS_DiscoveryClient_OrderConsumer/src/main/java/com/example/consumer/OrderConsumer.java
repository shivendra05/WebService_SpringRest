package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registry.PaymentConsumer;

@RestController
public class OrderConsumer {

	@Autowired
	PaymentConsumer payment;
	
	@GetMapping("/order")
	public String placeOrder() {
		return "FROM ORDER SERVICE => "+payment.payConsumer();
	}
}
