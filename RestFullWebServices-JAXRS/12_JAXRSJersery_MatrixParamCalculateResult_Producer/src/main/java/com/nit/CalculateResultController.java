package com.nit;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("calc")
public class CalculateResultController {

	@GET
	public String calculateResult(
			@MatrixParam("sid") int  id,
			@MatrixParam("sname") String sname,
			@MatrixParam("eng") Double eng,
			@MatrixParam("mat") Double mat,
			@MatrixParam("science") Double science
			) {
		
		double tltResult = eng+mat+science;
		
		StringBuilder builder=new StringBuilder();
		builder.append("Dear ").append(sname)
		.append(" Your RollNumber is ").append(id)
		.append(" you have scored ").append(tltResult);
		
		String grade="";
		if(eng>=90 && mat>=90 && science>=90) {
			grade ="A++";
		}else if(eng>=75 && mat>=75 && science>=75) {
			grade ="A+";
		}else if(eng>=60 && mat>=60 && science>=60) {
			grade ="A";
		}else if(eng>=55 && mat>=55 && science>=55) {
			grade ="B+";
		}else if(eng>=45 && mat>=45 && science>=45) {
			grade ="C+";
		}else if(eng<=45 && mat<=45 && science<=45) {
			grade ="Failed";
		}
		
		return builder.append(" Your Grade is ").append(grade).toString();
	}
}
