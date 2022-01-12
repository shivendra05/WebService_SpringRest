package in.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import in.app.dao.IStudentDAO;
import in.app.dao.IStudentDAOImpl;
import in.app.service.IStudentService;
import in.app.service.IStudentServiceImpl;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig() {	

		this.packages("in.app");
		this.register(new AbstractBinder() {

			@Override
			protected void configure() {
				//bind(class) to (interface)
				bind(IStudentDAOImpl.class).to(IStudentDAO.class);
				bind(IStudentServiceImpl.class).to(IStudentService.class);
			}
		});
	}
}