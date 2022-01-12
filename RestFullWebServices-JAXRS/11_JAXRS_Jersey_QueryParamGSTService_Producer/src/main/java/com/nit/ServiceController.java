package com.nit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/calc")
public class ServiceController {

	@GET
	@Path("/gst") //optional
	public String calGSTService(
			@QueryParam("pname") String name,
			@QueryParam("cost") double cost,
			@QueryParam("percent") double percent
			) {

		double finalCost = cost+(cost*percent)/100;

		return "PRODUCT "+name+" COST "+cost+ " WILL BE ON "+finalCost +" WITH GST";
	}
}
