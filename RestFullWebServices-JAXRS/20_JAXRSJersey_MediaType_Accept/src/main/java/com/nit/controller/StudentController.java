package com.nit.controller;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nit.model.Student;

@Path("/student")
public class StudentController {

	@GET
	@Produces({ MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student getStudent(){

		Student stud =  new Student();
		stud.setSid(100);
		stud.setSname("shivendra");;
		stud.setSage(32);

		return stud;
	}

	@Path("/list")
	@GET
	@Produces({ MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Student> getStudentList(){
		List<Student> list = List.of(new Student("shivendra",100,32),
				new Student("shivendra",100,32));

				return list;
	}
	
	@Path("/map")
	@GET
	@Produces({ MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Map<String,Student> getStudentMap(){
		Map<String,Student> map = Map.of("AA-12-100",new Student("shivendra",100,32),
				"AA-12-101",new Student("shivendra",100,32));

				return map;
	}
}