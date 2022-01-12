package com.nit.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.nit.model.Product;
import com.nit.service.IProductService;

@Path("/Product")
public class ProductRestController {

	@Inject
	private IProductService service;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveProduct(Product prod) {

		int status = service.saveProd(prod);

		if(status>=1)
			return Response.status(Status.OK).entity("PRODUCT SAVED").build();
		else
			return Response.status(Status.BAD_REQUEST).entity("UNABLE TO SAVE PRODUCT").build();
	}
}