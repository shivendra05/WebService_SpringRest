package in.connection;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/user")
public class UserAuthenticationController {

	@GET
	public Response validateUser(
			@HeaderParam("uname") String name,
			@HeaderParam("password") String pwd
			) {
		System.out.println(name+"  --  "+pwd);	
		Response res = null;

		if(name=="" || pwd =="" || "".equals(name)||name.isBlank()) {
			res = Response.status(Status.BAD_REQUEST)
					.header("uname",name)
					.entity("WRONG NAME/PASSWORD")
					.build();
		}else if(name.equals("shiv") && pwd.equals("shiv")) {
			res = Response.status(Status.OK)
					.entity("USER LOGGED-IN SUCCESSFULLY, WELCOME")
					.build();
		}else if(name!="shiv" || pwd !="shiv") {
			res = Response.status(Status.UNAUTHORIZED)
					.entity("WRONG NAME/PASSWORD")
					.build();
		}else {
			res = Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity("SERVER NOT REACHABLE")
					.build();
		}
		return res;
	}
}
