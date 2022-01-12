package com.example.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Branch;

@Component
@FeignClient("COMPANY-SERVICE")
public interface BranchConsumer {

	@GetMapping("/code")
	public String getBranchCode();
	
	@GetMapping("/branchDetail")
	public Branch getBranchDetails();
	
	@GetMapping("/allBranchDetail")
	public List<Branch> getAllBranchDetails();
	
	@GetMapping("/branchid/{id}")
	public String getBranchByID(@PathVariable int id);
}
