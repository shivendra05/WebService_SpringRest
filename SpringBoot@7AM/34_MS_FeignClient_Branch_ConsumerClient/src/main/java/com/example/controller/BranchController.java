package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.BranchConsumer;
import com.example.model.Branch;

@RestController
public class BranchController {
	
	@Autowired
	BranchConsumer consumer;
	
	@GetMapping("/bCode")
	public String getBranchCode() {
		return "YOUR CODE:: "+consumer.getBranchCode();
	}
	
	@GetMapping("/branchDetails")
	public Branch getBranchDetails() {
		return consumer.getBranchDetails();
	}
	
	@GetMapping("/allBranchDetail")
	public List<Branch> getAllBranchDetails(){
		return consumer.getAllBranchDetails();
	}
	
	@GetMapping("/branchid")
	public String getBranchByID() {
		return consumer.getBranchByID(3);
	}
}
