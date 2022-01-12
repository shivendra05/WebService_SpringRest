package com.nit.model;

import java.util.List;

import lombok.Data;

@Data
public class Result {

	private Integer sid;
	private String sname;
	private double tltMarks;
	private double avg;
	private String grade;
	private String finalResult;
	private List<MarksInfo> marksInfoList;
}
