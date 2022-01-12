package com.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class GSTCalcConsumer {
	public static void main(String[] args) {
		String URI="http://localhost:9090/11_JAXRS_Jersey_QueryParamGSTService_Producer";
		String path="/rest/calc/gst";
		try {
			//1. Create Client object
			Client c=ClientBuilder.newClient();
			//2. Add target and path
			WebTarget wt=c.target(URI).path(path);

			//Add Parameters Here to Request
			//queryParam(key,val)
			wt=wt.queryParam("cost", 100);
			wt=wt.queryParam("pname", "pen");
			wt=wt.queryParam("percent", 24);

			//3. convert to Request
			Invocation.Builder builder=wt.request();
			//4. provide method type
			Response resp=builder.get();
			//5. Print entity and status
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}}
}