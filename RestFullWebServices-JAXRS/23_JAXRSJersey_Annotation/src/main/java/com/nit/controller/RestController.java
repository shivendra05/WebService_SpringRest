package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/msg")
public class RestController {

	@GET
	public String wishMSG() {
		return "WELCOME BACK!!";
	}
}
