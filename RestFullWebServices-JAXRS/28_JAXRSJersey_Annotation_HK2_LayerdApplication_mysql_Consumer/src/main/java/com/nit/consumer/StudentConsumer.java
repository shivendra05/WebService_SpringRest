package com.nit.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import in.app.model.Student;

public class StudentConsumer {

	static String url= "http://localhost:9090/28_JAXRSJersey_Annotation_HK2_LayerdApplication_mysql";
	static String path= "/rest/student";
	public static String saveStudent(Student stud) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url).path(path);

		Invocation.Builder builder = target.request();
		Response res = builder.post(Entity.json(stud));

		System.out.println(res.getStatus());
		System.out.println(res.getStatusInfo());
		return res.readEntity(String.class);
	}
}
