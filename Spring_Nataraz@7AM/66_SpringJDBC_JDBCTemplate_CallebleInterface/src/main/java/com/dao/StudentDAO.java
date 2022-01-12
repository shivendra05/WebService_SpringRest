package com.dao;

import java.util.List;

import com.bo.StudentBO;

public interface StudentDAO {

	public StudentBO  getAllStudent(int sid) throws Exception;
	public List<StudentBO> getStudentByCity(String city1,String city2,String city3) throws Exception;
	public List<StudentBO> getStudentByCityUsingRowCallBack(String city1,String city2,String city3) throws Exception;
}
