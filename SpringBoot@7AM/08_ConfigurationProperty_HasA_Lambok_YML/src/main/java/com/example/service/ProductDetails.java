package com.example.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("prod")
public class ProductDetails implements CommandLineRunner {

	Product p;
	
	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return String.format("ProductDetails [p=%s]", p);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello");
		System.out.println(this);
	}
}