package com.nit.model;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;

import lombok.Data;

@Data
public class Student2 {

	@MatrixParam(value = "name")
	String name;
	@PathParam(value = "sid")
	int sid;
	@HeaderParam(value = "sage")
	int sage;
	
}
