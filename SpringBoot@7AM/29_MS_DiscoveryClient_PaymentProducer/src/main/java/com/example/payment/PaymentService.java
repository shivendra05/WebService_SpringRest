package com.example.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentService {

	@GetMapping("/pay")
	public String getPayment() {
		return " PAYMENT COMPLETED";
	}
}
