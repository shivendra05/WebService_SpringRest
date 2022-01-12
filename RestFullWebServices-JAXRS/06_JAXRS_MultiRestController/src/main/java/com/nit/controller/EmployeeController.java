package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employee")
public class EmployeeController {

	@GET
	public String getEmployee() {
		return "I AM EMPLOYEE";
	}
}
