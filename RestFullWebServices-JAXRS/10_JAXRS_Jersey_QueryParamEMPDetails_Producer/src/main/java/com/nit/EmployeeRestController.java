package com.nit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/emp")
public class EmployeeRestController {

	//.. /emp?eid=10&ename=A&esal=3.3
	
	@GET
	public String readInputs(
			@QueryParam("eid")int id,
			@QueryParam("ename")String name,
			@QueryParam("esal")double sal
			) 
	{
		return "Input data is: ID="+id+",NAME="+name+",SAL="+sal;
	}
}
