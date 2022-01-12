package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeController {

	@GET
	public String getEmplyeeName() {
		return "EMPLOYEE NAME:: SHIVENDRA";
	}

	@GET
	@Path("/age")
	public String getEmplyeeAge() {
		return "EMPLOYEE AGE:: 32";
	}

	@POST
	public String getEmplyeeGrade() {
		return "EMPLOYEE HAVE A++ GRADE";
	}

	@Path("/school")
	@POST
	public String getEmplyeeSchool() {
		return "EMPLOYEE SHCOOL NAME:: DEEP JYOTI";
	}
}