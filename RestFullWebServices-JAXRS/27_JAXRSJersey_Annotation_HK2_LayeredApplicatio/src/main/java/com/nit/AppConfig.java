package com.nit;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.nit.dao.IStudentDAO;
import com.nit.dao.IStudentDAOImpl;
import com.nit.service.IStudentService;
import com.nit.service.IStudentServiceImpl;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig() {	

		packages("com.nit");
		register(new AbstractBinder() {

			@Override
			protected void configure() {
				//bind(class) to (interface)
				bind(IStudentDAOImpl.class).to(IStudentDAO.class);
				bind(IStudentServiceImpl.class).to(IStudentService.class);
			}
		});
	}
}