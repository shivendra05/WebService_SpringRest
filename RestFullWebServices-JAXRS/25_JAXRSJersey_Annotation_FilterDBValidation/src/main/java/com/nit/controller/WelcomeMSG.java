package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/msg")
public class WelcomeMSG {

	@GET
	public String greetingMSG(
			) {
		return "HELLO, HOW ARE YOU";
	}
}
	