package com.authentication;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class UserLoginVlidation {

	public static void main(String[] args) {

		String url = "http://localhost:9090/13_JAXRSJersey_HeaderParam_UserAuth_Producer";
		String path ="/rest/user";
		Client client = ClientBuilder.newClient();

		WebTarget  target= client.target(url).path(path);

		Invocation.Builder  builder= target.request();

		builder.header("uname", "shiv");
		//builder.header("password", "shiv123");

		Response resposne =  builder.get();

		System.out.println(resposne.getStatus());
		System.out.println(resposne.getStatusInfo());
		System.out.println(resposne.readEntity(String.class));
	}
}