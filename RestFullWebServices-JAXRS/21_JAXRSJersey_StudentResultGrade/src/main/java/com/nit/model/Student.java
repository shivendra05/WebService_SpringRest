package com.nit.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Student {

	private Integer sid;
	private String sname;
	private Map<String, Integer> marks;
	private List<String> faculty;
}
