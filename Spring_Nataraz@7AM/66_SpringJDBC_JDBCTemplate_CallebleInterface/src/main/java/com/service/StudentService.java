package com.service;

import java.util.List;

import com.bo.StudentBO;

public interface StudentService {

	public StudentBO  getAllStudentService(int sid) throws Exception;
	public List<StudentBO>  getAllStudentDetails(String c1,String c2,String c3) throws Exception;
	public List<StudentBO> getStudByCityRowCallBack(String city1,String city2,String city3) throws Exception;

}
