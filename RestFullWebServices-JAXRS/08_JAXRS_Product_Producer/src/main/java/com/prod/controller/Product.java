package com.prod.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/product")
public class Product {

	@GET
	public String getProductDetails() {
		return "YOU HAVE ORDERED ELECTRONICS PRODUCT";
	}
}