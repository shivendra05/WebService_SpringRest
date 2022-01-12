package com.test.model;

import java.io.Serial;

import com.google.gson.annotations.Expose;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student2 {
	
	@Expose
	private int studID;
	@Expose
	private String studName;
	private int studAge;
	private String clgName;

}
