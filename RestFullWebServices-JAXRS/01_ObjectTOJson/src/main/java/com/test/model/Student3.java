package com.test.model;

import com.google.gson.annotations.Expose;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student3 {
	
	@Expose
	private int studID;
	@Expose
	private String studName;
	private int studAge;
	private String clgName;

}
