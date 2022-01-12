package com.nit.controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nit.model.Student;
import com.nit.model.Student2;

@Path("/student")
public class StudentController {

	@GET
	public String getStudentDetails(
			@BeanParam Student stud
			) {
		
		stud.setAddr("REWA");
		stud.setSid(100);
		stud.setSage(32);
		stud.setName("shivendra");
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Dear, ").append(stud.getName())
		.append(", Your roll number is ").append(stud.getSid())
		.append(", you are ").append(stud.getSage()).append(" Year old.")
		.append(", belong to ").append(stud.getAddr());
		
		return builder.toString();
	}
	
	@GET
	@Path("/{sid}")
	public String getStudentDetails(
			@BeanParam Student2 stud
			) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Dear, ").append(stud.getName())
		.append(", Your roll number is ").append(stud.getSid())
		.append(", you are ").append(stud.getSage()).append(" Year old.");
		
		return builder.toString();
	}
}