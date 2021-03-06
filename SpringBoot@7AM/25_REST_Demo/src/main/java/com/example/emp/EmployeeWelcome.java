package com.example.emp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		
@RequestMapping("/rest/student")
public class EmployeeWelcome {

	@GetMapping("/all")
	public ResponseEntity<String> getAllData(){
		String body = "WELCOME TO GET REQUEST";
		ResponseEntity<String> msg = new ResponseEntity<String>(body, HttpStatus.OK);
		return msg;
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createNewData(){
		String body ="WELCOME TO POST REQUEST";
		ResponseEntity<String> msg = new ResponseEntity<String>(body,HttpStatus.OK);
		return msg;
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> modifyData(){
		String body ="WELCOME TO PUT REQUEST";
		ResponseEntity<String> msg = new ResponseEntity<String>(body,HttpStatus.OK);
		return msg;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteData(){
		String body ="WELCOME TO DELETE REQUEST";
		ResponseEntity<String> msg = new ResponseEntity<String>(body,HttpStatus.OK);
		return msg;
	}
} 
