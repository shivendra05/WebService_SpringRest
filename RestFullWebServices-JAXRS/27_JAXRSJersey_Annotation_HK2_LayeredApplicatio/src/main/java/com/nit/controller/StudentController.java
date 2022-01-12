package com.nit.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nit.service.IStudentService;

@Path("/msg")
public class StudentController {

	@Inject
	private IStudentService service;
	
	@GET
	public String getMSG() {
		
		return "FROM REST CONTROLLER: "+service.getService();
	}
}
