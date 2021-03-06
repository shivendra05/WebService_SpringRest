package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QuoteConsumer {

	@Autowired
	private	LoadBalancerClient client;

	public String getQuote() {

		ServiceInstance instance= client.choose("QUOTE-SERVICE");

		String url =instance.getUri()+"/quote";

		RestTemplate template = new RestTemplate();

		ResponseEntity<String> response = template.getForEntity(url, String.class);

		return response.getBody();
	}
}
