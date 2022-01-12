package com.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class EmployeeConsumer {
	public static void main(String[] args) {
		String URI="http://localhost:9090/10_JAXRS_Jersey_QueryParamEMPDetails_Producer";
		String path="/rest/emp";
		try {
			//1. Create Client object
			Client c=ClientBuilder.newClient();
			//2. Add target and path
			WebTarget wt=c.target(URI).path(path);
			
			//Add Parameters Here to Request
			//queryParam(key,val)
			wt=wt.queryParam("eid", 10);
			wt=wt.queryParam("ename", "RR");
			wt=wt.queryParam("esal", 66.56);
			
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