package com.test;

import com.google.gson.Gson;
import com.test.model.Student1;

public class StudentObjToJSON1{
    public static void main( String[] args ){
    	Student1 student = new Student1();
    	
    	student.setStudID(100);
    	student.setStudName("shivendra");
    	student.setStudAge(30);
    	student.setClgName("NITTTR");
    	
    	Gson objToJson = new Gson();
    	
    	String json = objToJson.toJson(student);
    	System.out.println(json);
    }
}
