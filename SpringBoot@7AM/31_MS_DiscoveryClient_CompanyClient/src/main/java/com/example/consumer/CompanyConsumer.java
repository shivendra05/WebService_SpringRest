package com.example.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CompanyConsumer {

	@Autowired
	DiscoveryClient client;
	
	public String vendorConsume() {
		List<ServiceInstance> instance = client.getInstances("VENDOR-SERVICE");
		
		ServiceInstance si = instance.get(0);
		
		String url = si.getUri()+"/vendor";
		
		RestTemplate template = new RestTemplate();
		
		 ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		return response.getBody();
	}
}
