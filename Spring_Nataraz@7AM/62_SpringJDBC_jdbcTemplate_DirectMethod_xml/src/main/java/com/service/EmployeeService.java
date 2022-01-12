package com.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	public int getempCount() throws Exception;
	public String getEmpName(int eno) throws Exception;
	public List getEmpDetails() throws Exception;
	public Map<String, Object> getEmp(int eno) throws Exception;
}
