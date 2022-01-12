package com.nit;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.nit.dao.IProductDAO;
import com.nit.dao.IProductDAOImpl;
import com.nit.service.IProductService;
import com.nit.service.IProductServiceImpl;


@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		
		packages("com.nit");
		register(new AbstractBinder() {
			@Override
			protected void configure() {

				bind(IProductDAOImpl.class).to(IProductDAO.class);
				bind(IProductServiceImpl.class).to(IProductService.class);
			}
		});
		
	}
}
