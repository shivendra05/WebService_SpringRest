package in.app.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import in.app.model.Student;
import in.app.service.IStudentService;

@Path("/student")
public class StudentController {

	@Inject
	IStudentService service;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response storeStudentRecord(Student stud) {
		int status = service.saveStudentData(stud);
		if(status==1) {
			return	Response.status(Status.CREATED).entity("Student Data Inserted").build();
		}else if(status==0) {
			return	Response.status(Status.BAD_REQUEST).entity("UNABLE TO INSERT").build();
		}else {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("UNABLE TO CONNECT").build();
		}
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudentRecord(Student stud) {
		List<Student> studList=null;
		studList = service.getStudents();
		System.out.println("Controller:: "+studList);
		return	Response.status(Status.OK).entity(studList).build();
	}
}
