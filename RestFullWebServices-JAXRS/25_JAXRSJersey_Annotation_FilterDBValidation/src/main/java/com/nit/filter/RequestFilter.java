package com.nit.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.StatusType;

public class RequestFilter implements ContainerRequestFilter{

	@Context
	public HttpHeaders header;

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		System.out.println("REQUEST FILTER");
		String uname = header.getHeaderString("uname").trim();
		String password = header.getHeaderString("password").trim();

		if("".equalsIgnoreCase(uname) || "".equalsIgnoreCase(password)) {
			System.out.println("1");
			requestContext.abortWith(
					Response.status(Status.BAD_REQUEST).entity("NULL/EMPTY PASSWORD/USERNAME").build());
		}else if(!("shiv".equalsIgnoreCase(uname)) || !("shiv".equalsIgnoreCase(password))) {
			System.out.println("3");
			requestContext.abortWith(
					Response.status(Status.UNAUTHORIZED).entity("INVALID USERNAME/PASSWORD").build());
		}

	}
}