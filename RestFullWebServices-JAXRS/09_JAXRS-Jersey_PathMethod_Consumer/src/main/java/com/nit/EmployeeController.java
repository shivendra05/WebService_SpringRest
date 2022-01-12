package com.nit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class EmployeeController {
	public static void main(String[] args) {
		String url = "http://localhost:9090/09_JAXRS-Jersey_PathMethod_Producer";
		//String path = "/rest/emp";
		//String path = "/rest/emp/age";
		//String path = "/rest/emp";
		String path = "/rest/emp/school";
		
		//create client object using ClientBuilder
		Client client= ClientBuilder.newClient();

		//get the resource url and path
		WebTarget target = client.target(url).path(path);

		//send an request to the path
		Invocation.Builder builder =  target.request();

		//hit resource method
		//Response resposne = builder.get();
		Response resposne = builder.post(null);

		System.out.println(resposne.getStatus());
		System.out.println(resposne.getStatusInfo());
		System.out.println(resposne.readEntity(String.class));
	}
}
