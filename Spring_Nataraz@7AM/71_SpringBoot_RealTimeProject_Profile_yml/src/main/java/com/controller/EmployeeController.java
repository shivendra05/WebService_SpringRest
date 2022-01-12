package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;
import com.vo.EmployeeVO;

@Controller("controller")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	/*EmployeeController(EmployeeService service){
		this.service=service;
	}*/
	
	public List<EmployeeVO> getEmpDetails(String dept1, String dept2) throws Exception {
		
		List<EmployeeDTO> listDTO=null;
		
		List<EmployeeVO> listVO=null;
		EmployeeVO vo=null;
		
		listVO = new ArrayList<EmployeeVO>();
		
		listDTO = service.getEmpService(dept1, dept2);
		for(EmployeeDTO dtoTOvo:listDTO) {
			vo= new EmployeeVO();
			BeanUtils.copyProperties(dtoTOvo, vo);
			vo.setEmpNo(String.valueOf(dtoTOvo.getEmpNo()));
			vo.setSal(String.valueOf(dtoTOvo.getSal()));
			vo.setDeptNo(String.valueOf(dtoTOvo.getDeptNo()));
			listVO.add(vo);
		}
		return listVO;
	}
}
