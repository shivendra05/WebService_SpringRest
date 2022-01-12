package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/getName")
public class EmployeeConrtoller {

	@GET
	public String getEmployeeName() {
		return "EMPLYEE NAME IS SHIVENDRA";
	}
}