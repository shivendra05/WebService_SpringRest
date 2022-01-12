package com.dao;

import java.util.List;

import com.bo.EmployeeBO;

public interface EmployeeDAO {

	public List<EmployeeBO> getEmpByJob(String dept1, String dept2) throws Exception;
}
