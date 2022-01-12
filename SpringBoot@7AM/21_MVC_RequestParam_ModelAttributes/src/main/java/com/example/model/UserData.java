package com.example.model;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class UserData {

	private int uid;
	private String uname;
	private int age;
	
	private String pwd;
	private Date dob;
	private String addr;
	
	private String gender;
	private String pname;
	
	private List<String> loc;
	private List<String> cbranch;
	
}
