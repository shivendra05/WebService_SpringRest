package com.nit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class EmployeeRestController {

	public static void main(String[] args) {

		String url = "http://localhost:9090/16_JAXRSJersey_PathParam_Producer";
		String path = "/rest/emp/ram";

		Client client = ClientBuilder.newClient();

		WebTarget target =  client.target(url).path(path);

		Invocation.Builder  builder = target.request();

		Response response = builder.get();

		System.out.println(response.getStatus());
		System.out.println(response.getStatusInfo());
		System.out.println(response.readEntity(String.class));
	}
}
