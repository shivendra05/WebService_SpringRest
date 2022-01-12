package com.injection;

public class Collage{
	StudentResult result;

	public Collage(StudentResult result){
		this.result=result;
	}

	public String prepareResult(){
		result= new StudentResult();
		return result.getResult();
	}
}