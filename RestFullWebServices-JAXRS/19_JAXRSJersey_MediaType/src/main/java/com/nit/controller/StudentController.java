package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nit.model.Student;

@Path("/student")
public class StudentController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(){

		Student stud =  new Student();

		stud.setSid(100);
		stud.setSname("shivendra");;
		stud.setSage(32);

		return stud;
	}
}