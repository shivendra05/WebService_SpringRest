package com.example.comsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("COURSE-SERVICE")
public interface StudentConsumer {

	@GetMapping("/tech")
	public String getTechnicalCourses();

	@GetMapping("/nonTech")
	public String getNonTechnicalCourses();
	
	@GetMapping("/school")
	public String getSchollCourses();
}
