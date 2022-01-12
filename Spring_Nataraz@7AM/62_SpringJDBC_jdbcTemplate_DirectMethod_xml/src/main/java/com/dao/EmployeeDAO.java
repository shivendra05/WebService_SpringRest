package com.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	public int getEmployeeCount() throws Exception;
	public String getEmployeeNameByID(int eno) throws Exception;
	public List getEmployeeDetails() throws Exception;
	public Map<String, Object> getEmployee(int eno) throws Exception;
}