package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Branch;

@RestController
public class CompanyController {

	@GetMapping("/code")
	public String getBranchCode() {
		return "HYD-3241";
	}

	@GetMapping("/branchDetail")
	public Branch getBranchDetails() {
		return new Branch(100,"Excellance","HYD");
	}

	@GetMapping("/allBranchDetail")
	public List<Branch> getAllBranchDetails() {
		return List.of(new Branch(100,"Excellance","HYD"),
				new Branch(101,"Second","DEL"),
				new Branch(102,"Third","MUB"),
				new Branch(103,"Fourth","BPL"));
	}
	
	@GetMapping("/branchid/{id}")
	public String getBranchByID(
			@PathVariable int id) {
		return "Branch details for id:: "+id+" "+new Branch(101,"Second","DEL");
	}
}