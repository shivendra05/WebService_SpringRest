package com.nit.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nit.service.IService;

@Path("/msg")
public class WelcomeController {
	@Inject
	private IService service;
	
	@GET
	public String show() {
		return "I AM SHIV:: "+service.showMSG();
	}
}
