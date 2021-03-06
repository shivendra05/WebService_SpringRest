package com.example.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CourseConsumer {
	@Autowired
	DiscoveryClient client;
	
	public String getCourse() {
		
		List<ServiceInstance> instance = client.getInstances("COURSE-NAME");
		
		ServiceInstance si = instance.get(0);
		
		String url = si.getUri()+"/course";
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> body= template.getForEntity(url, String.class);
		
		return body.toString();
	}
}
