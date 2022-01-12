package com.nit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/emp")
public class EmployeeController {

	@Path("/ename")
	@GET
	public String getEmployee() {
		return "YOUR ARE SHIVENDRA";
	}

	@Path("/{ename}")
	@GET
	public String getEmployee(
			@PathParam("ename")String name) {
		return "YOUR ARE "+name;
	}
}