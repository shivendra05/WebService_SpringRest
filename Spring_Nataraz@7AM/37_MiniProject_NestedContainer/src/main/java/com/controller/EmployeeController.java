package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bo.EmployeeBO;
import com.dao.EmployeeDAO;
import com.dto.EmployeeDTO;
import com.service.EmployeeService;
import com.vo.EmployeeVO;

public class EmployeeController {
	EmployeeService service;
	
	EmployeeController(EmployeeService service){
		this.service=service;
	}
	
	public List<EmployeeVO> getEmpDetails(String dept1, String dept2) throws Exception {
		
		List<EmployeeDTO> listDTO=null;
		
		List<EmployeeVO> listVO=null;
		EmployeeVO vo=null;
		
		listVO = new ArrayList<EmployeeVO>();
		
		listDTO = service.getEmpService(dept1, dept2);
		for(EmployeeDTO dtoTOvo:listDTO) {
			vo= new EmployeeVO();
			BeanUtils.copyProperties(dtoTOvo, vo);
			//[empNo=null, ename=shivendra, job=QA, sal=null, deptNo=null]
			vo.setEmpNo(String.valueOf(dtoTOvo.getEmpNo()));
			vo.setSal(String.valueOf(dtoTOvo.getSal()));
			vo.setDeptNo(String.valueOf(dtoTOvo.getDeptNo()));
			listVO.add(vo);
		}
		return listVO;
	}
}
