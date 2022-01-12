package com.nit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ResultCalculator {

	public static void main(String[] args) {
		String url = "http://localhost:9090/12_JAXRSJersery_MatrixParamCalculateResult_Producer";
		String path = "/rest/calc";
		
		Client client  = ClientBuilder.newClient();
		
		WebTarget target = client.target(url).path(path);
		
		target.matrixParam("sid", 1111);
		target.matrixParam("sname", "shiv");
		//target.matrixParam("eng", 55.98);
		//target.matrixParam("mat", 66.89);
		//target.matrixParam("science", 77.67);

		Invocation.Builder builder = target.request();
		
		Response response = builder.get();
		
		System.out.println(response.getStatus());
		System.out.println(response.getStatusInfo());
		System.out.println(response.readEntity(String.class));
				
	}
}
