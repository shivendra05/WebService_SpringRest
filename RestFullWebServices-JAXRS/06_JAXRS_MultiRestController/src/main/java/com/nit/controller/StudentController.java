package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/student")
public class StudentController {

	@GET
	public String getStudent() {
		return "I AM STUDENT";
	}
}
