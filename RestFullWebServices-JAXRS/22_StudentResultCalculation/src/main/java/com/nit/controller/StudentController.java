package com.nit.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nit.model.Mark;
import com.nit.model.MarksInfo;
import com.nit.model.Result;
import com.nit.model.Student;

@Path("/student")
public class StudentController {

	@POST
	@Consumes({"application/json",MediaType.APPLICATION_XML})
	@Produces({"application/json",MediaType.APPLICATION_XML})
	public Result calStudentResult(
			Student stud) {

		double tltMarks,tlttMarks = 0,tltlMakrs = 0;
		double avgMarks;
		String grade;
		String finalResult="FAIL";

		Result result = new Result();
		List<Mark> listMarks= stud.getMarkList();
		List<MarksInfo> marksInfoList = new ArrayList<MarksInfo>();
		MarksInfo marksInfo = new MarksInfo();
		
		//marks":[{"ENG",13,23},{"MAT",15,53},{"SCI",43,43}]"
		List<Integer> tMarksList = new ArrayList<Integer>();
		List<Integer> lMarksList = new ArrayList<Integer>();
			
		for (Mark marks: listMarks) {
			String tResult = null,lResult = null;
			String subName = marks.getSubName();
			double tMarks = marks.getTmarks();
			double lMarks = marks.getPmarks();

			tMarksList.add((int) tMarks);
			lMarksList.add((int) tMarks);

			for(int tm:tMarksList) {
				tlttMarks+=tm;
				if(tm>=40) {
					tResult="PASS";
				}
			}
			for(int lm:lMarksList) {
				tltlMakrs+=lm;
				if(lm>=12) {
					lResult="PASS";
				}
			}

			if(tResult.equalsIgnoreCase("PASS")&&lResult.equalsIgnoreCase("PASS")) {
				finalResult="PASS";
			}

			marksInfo.setLMarks(lMarks);
			marksInfo.setTMarks(tMarks);
			marksInfo.setSubName(subName);

			marksInfoList.add(marksInfo);

			result.setFinalResult(finalResult);
			result.setMarksInfoList(marksInfoList);
		}


		result.setSid(stud.getSid());
		result.setSname(stud.getSname());

		tltMarks = tlttMarks+tltlMakrs;
		avgMarks=tltMarks/listMarks.size();

		if(tltMarks>=280) {
			grade="A+";
		}else if(tltMarks>=240) {
			grade="A";
		}else if(tltMarks>=200) {
			grade="B+";
		}else if(tltMarks>=180) {
			grade="B";
		}else {
			grade="C";
		}

		result.setGrade(grade);
		result.setTltMarks(tltMarks);
		result.setAvg(avgMarks);

		return result;
	}
}
