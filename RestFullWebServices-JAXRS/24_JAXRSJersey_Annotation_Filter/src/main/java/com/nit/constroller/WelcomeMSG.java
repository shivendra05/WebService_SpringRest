package com.nit.constroller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("msg")
public class WelcomeMSG {

	@GET
	public String welcomeMSG() {
		System.out.println("CONTROLLER CLASS");
		return "HELLO, DEAR.!! WELCOME";
	}
}
