package com.test;

import javax.ws.rs.Path;

@Path("/name")
public class StudentObjToXML1{
	@get
	public String getEmployeeName() {
		return "shivendra";
	}
}