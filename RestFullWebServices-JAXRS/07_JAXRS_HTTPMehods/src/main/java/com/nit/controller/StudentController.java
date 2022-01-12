package com.nit.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/student")
public class StudentController {

	@GET
	public String getStudentName() {
		return "I AM SHIVENDRA-GET";
	}
	
	@POST
	public String getStudentAddress() {
		return "I AM IN REWA-POST";
	}
	
	@PUT
	public String getStudentAge() {
		return "MY AGE IS-PUT";
	}
	@DELETE
	public String getStudentGrade() {
		return "MY GRADE IS A-DELETE";
	}
}
