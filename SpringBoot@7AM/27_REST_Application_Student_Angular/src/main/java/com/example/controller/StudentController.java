package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.IStudent;

@RestController
@RequestMapping("/rest/emp")
public class StudentController {

	@Autowired
	private IStudent service;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmpData(@RequestBody Student stud){
		ResponseEntity<String> res =null;
		try {

			String saveMSG = service.saveStudentDetails(stud);
			res = new ResponseEntity<String>(saveMSG,HttpStatus.OK);
			return res;
		}catch (Exception e) {
			res = new ResponseEntity<String>("Unable to Save Sudent Data",HttpStatus.INTERNAL_SERVER_ERROR);
			return res;
		}
	}

	@GetMapping("/all")
	public @ResponseBody ResponseEntity<?> getAllEmp(){
		List<Student> listStudent=null;
		ResponseEntity<?> res=null;
		try {
			listStudent = service.getAllStudent();
			System.out.println(listStudent);
			res = new ResponseEntity<List<Student>>(listStudent, HttpStatus.OK);
			System.out.println(res);
			return res;
		}catch (Exception e) {
			res = new ResponseEntity<String>("UNABLE TO FETCH DATA", HttpStatus.INTERNAL_SERVER_ERROR);
			return res;
		}
	}

	@GetMapping("/{studID}")
	public ResponseEntity<?> getStudByID(
			@PathVariable("studID") int id
			){
		Student stud=null;
		ResponseEntity<?> res=null;
		try {
			stud = service.getStudentByID(id);
			System.out.println(stud);
			res = new ResponseEntity<Student>(stud,HttpStatus.OK);
			return res;
		}catch (Exception e) {
			res = new ResponseEntity<String>("No Student found with "+id,HttpStatus.OK);
			return res;
		}
	}

	@DeleteMapping("/delete/{sID}")
	public ResponseEntity<String> deleteStudByID(
			@PathVariable("sID") int id
			){
		ResponseEntity<String> responseMSG = null;
		try {
			String deleteMSG=null;
			deleteMSG = service.deleteStudentByID(id);
			System.out.println(deleteMSG);
			responseMSG = new ResponseEntity<String>(deleteMSG,HttpStatus.OK);
			return responseMSG;
		}catch (Exception e) {
			responseMSG = new ResponseEntity<String>("ID NOT FOUND TO DELETE "+id,HttpStatus.OK);
			return responseMSG;
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> deleteStudByID(
			@RequestBody Student stud
			){
		ResponseEntity<String> responseMSG = null;
		boolean status =false;
		int id=0;
		try {
			String updateMSG=null;
			id = stud.getStudID();
			status = service.existStudent(id);
			if(status==true) {
				updateMSG = service.updateStudentDetails(stud);
				responseMSG = new ResponseEntity<String>(updateMSG,HttpStatus.OK);
				return responseMSG;
			}else {
				responseMSG = new ResponseEntity<String>("ID DOESNT EXIST",HttpStatus.OK);
				return responseMSG;
			}
			
		}catch (Exception e) {
			responseMSG = new ResponseEntity<String>("Unable to do updation for "+id,HttpStatus.INTERNAL_SERVER_ERROR);
			return responseMSG;
		}
	}
}