package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.StudentBO;
import com.dao.StudentDAO;

@Service("service")
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO dao;
	
	@Override
	public StudentBO getAllStudentService(int sid) throws Exception {
		StudentBO serviceBO= null;
		
		serviceBO = dao.getAllStudent(sid);
		return serviceBO;
	}

	@Override
	public List<StudentBO> getAllStudentDetails(String c1, String c2, String c3) throws Exception {
		List<StudentBO> serviceBO=null;
		serviceBO = new ArrayList<>();
		
		serviceBO = dao.getStudentByCity(c1, c2, c3);
		
		return serviceBO;
	}

	@Override
	public List<StudentBO> getStudByCityRowCallBack(String city1, String city2, String city3) throws Exception {
		List<StudentBO> serviceBO1=null;
		serviceBO1 = new ArrayList<>();
		
		serviceBO1 = dao.getStudentByCityUsingRowCallBack(city1, city2, city3);
		System.out.println(serviceBO1);
		return serviceBO1;
	}
}