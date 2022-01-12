package com.nit.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ProductConsumer {
	public static void main(String[] args) {

		String url ="http://localhost:9090/08_JAXRS_Product_Producer";
		String path ="/rest/product";
		try {
			
			Client client = ClientBuilder.newClient();
			WebTarget target =	client.target(url).path(path);

			Invocation.Builder builder =	target.request();
			Response response = builder.get();

			int statusCode = response.getStatus();
			Object obj = response.getStatusInfo();
			String str = response.readEntity(String.class);

			System.out.println(statusCode);
			System.out.println(obj);
			System.out.println(str);
		}catch (Exception e) {

			e.printStackTrace();
		}
	}
}
