package com.nit.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nit.model.Student;

@Path("/student")
public class StudentController {

	@POST
	@Consumes({"application/json",MediaType.APPLICATION_XML})
	public String calStudentResult(
			Student stud) {
		StringBuilder builder=new StringBuilder();

		int countFaclty = stud.getFaculty().size();

		int tltMark = stud.getMarks().get("ENG")+stud.getMarks().get("MAT")+stud.getMarks().get("SCI");
		double avgMarks = tltMark/3;
		String finalResult,grade;
		if(stud.getMarks().get("ENG")>=75 && stud.getMarks().get("MAT")>=75 && stud.getMarks().get("SCI")>=75) {
			grade="A+";
			finalResult="PASSED";
		} else if(stud.getMarks().get("ENG")>=65 && stud.getMarks().get("MAT")>=65 && stud.getMarks().get("SCI")>=65) {
			grade="A";
			finalResult="PASSED";
		}else if(stud.getMarks().get("ENG")>=45 && stud.getMarks().get("MAT")>=45 && stud.getMarks().get("SCI")>=45) {
			grade="B";
			finalResult="PASSED";
		}else if(stud.getMarks().get("ENG")>=40 && stud.getMarks().get("MAT")>=40 && stud.getMarks().get("SCI")>=40) {
			grade="C";
			finalResult="PASSED";
		}else {
			grade="NO GRADE";
			finalResult="FAILED";
		}

		builder.append("Dear, ").append(stud.getSname())
		.append(", RollNumber ").append(stud.getSid())
		.append("\n Total Marks Scored ").append(tltMark)
		.append(", avg is ").append(avgMarks)
		.append(", Result ").append(finalResult)
		.append(", Garde is ").append(grade)
		.append("\n Total Faculty is collages ").append(countFaclty);

		return builder.toString();
	}
}
