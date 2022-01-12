package com.nit.controller;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/cookies")
public class CookiesController {

	@GET
	@Path("/create")
	public Response storeCookies() {
		NewCookie cookies = new NewCookie("name", "shivendra");

		Response response = Response.status(Status.OK)
				.entity("Cookies are added")
				.cookie(cookies)
				.build();
		return response;
	}

	@GET
	public Response getCookies(
			@CookieParam("name") String name) {

		Response response = null;
		if(name!="") {
			response = Response.status(Status.OK)
					.entity("ADDED COOKIES ARE :: "+name)
					.build();
		}else {
			response = Response.status(Status.NOT_FOUND)
					.entity("COOKIES ARE NOT FOUND  ADDED")
					.build();
		}


		return response;
	}
}
