package com.example.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("data")
public class ProductDetails implements CommandLineRunner {
	private String db;
	
	@Override
	public String toString() {
		return String.format("ProductDetails [db=%s]", db);
	}
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello");
		System.out.println(this);
	}

	public String getDb() {
		return db;
	}
	
	public void setDb(String db) {
		this.db = db;
	}
}