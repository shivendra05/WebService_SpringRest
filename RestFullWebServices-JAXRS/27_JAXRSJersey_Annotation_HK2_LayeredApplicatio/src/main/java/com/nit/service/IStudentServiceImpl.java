package com.nit.service;

import javax.inject.Inject;

import com.nit.dao.IStudentDAO;

public class IStudentServiceImpl implements IStudentService{

	@Inject
	private IStudentDAO dao;
	
	@Override
	public String getService() {
		return "FROM SERVICE: "+dao.getData();
	}
}