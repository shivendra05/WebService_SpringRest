package com.nit;

import  javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.nit.service.IService;
import com.nit.service.IServiceImpl;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig(){
		packages("com.nit");
		register(new AbstractBinder() {

			@Override
			protected void configure() {
				//bind(class) to (interface)
				bind(IServiceImpl.class).to(IService.class);
			}
		});
	}
}
