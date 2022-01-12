package com.service;

import java.util.List;

import com.dto.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> getEmpService(String dept1, String dept2) throws Exception;
}
