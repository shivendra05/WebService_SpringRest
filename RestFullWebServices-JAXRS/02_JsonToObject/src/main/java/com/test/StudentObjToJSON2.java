package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.test.model.Student2;

public class StudentObjToJSON2 {

	public static void main(String[] args) {
		
		//step1:: create object with data
		Student2 stud = new Student2();
		
		stud.setStudID(1001);
		//stud.setStudName("Pandey Ji");
		stud.setStudAge(31);
		stud.setClgName("SIST");
		
		//step2:: create Gson Object.
		Gson json = new GsonBuilder().setPrettyPrinting().create();
		
		String obj = json.toJson(stud);
		System.out.println(obj);
		
		Student2 stud2 =json.fromJson(obj, Student2.class);
		System.out.println(stud2);
	}
}
