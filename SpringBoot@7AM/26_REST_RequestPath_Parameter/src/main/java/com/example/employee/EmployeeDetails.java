package com.example.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeDetails {

	//request Parameter (URL?key=value&key=value)
	@GetMapping("/find")
	public ResponseEntity<String> getRequestParam(
			@RequestParam("name") String ename,
			@RequestParam("age") int eage
			){

		String body = "Employee Data:: name="+ ename+" age="+eage;

		ResponseEntity<String> res = new ResponseEntity<String>(body,HttpStatus.OK);
		return res;
	}

	//path Parameter (URL/{key}/{key})
	@GetMapping("/rollNumber/{roll}/{year}")
	public ResponseEntity<String> getPathParam(
			@PathVariable("roll") int roll,
			@PathVariable("year") int year
			){

		String body = "Student Data:: RollNumber="+ roll+" year="+year;

		ResponseEntity<String> res = new ResponseEntity<String>(body,HttpStatus.OK);
		return res;
	}
}
