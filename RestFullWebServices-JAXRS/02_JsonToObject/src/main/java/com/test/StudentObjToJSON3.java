package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.model.Student3;

public class StudentObjToJSON3 {

	public static void main(String[] args) {
		
		//step1:: create object with data
		Student3 stud = new Student3();
		
		stud.setStudID(1001);
		//stud.setStudName("Pandey Ji");
		stud.setStudAge(31);
		stud.setClgName("SIST");
		
		//step2:: create Gson Object.
		Gson json = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
		
		String obj = json.toJson(stud);
		
		System.out.println(obj);
		
	}
}
