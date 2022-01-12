package com.example.registry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class PaymentConsumer {

	@Autowired
	DiscoveryClient client;
	
	public String payConsumer() {
		List<ServiceInstance> instance= client.getInstances("PAYMENT-SERVICE");
		
		ServiceInstance si = instance.get(0);
		
		String url = si.getUri()+"/pay";
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> response =  template.getForEntity(url, String.class);
		
		return response.getBody();
	}
}
