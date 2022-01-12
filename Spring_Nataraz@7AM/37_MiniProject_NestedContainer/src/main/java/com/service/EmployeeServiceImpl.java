package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bo.EmployeeBO;
import com.dao.EmployeeDAO;
import com.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO dao;

	EmployeeServiceImpl(EmployeeDAO dao){
		this.dao=dao;
	}

	@Override
	public List<EmployeeDTO> getEmpService(String dept1, String dept2) throws Exception {
		try {
			EmployeeDTO dto=null;
			List<EmployeeDTO> listDTO= null;
			List<EmployeeBO> listDto= null;
			listDTO = new ArrayList<EmployeeDTO>();

			//list EmployeeBO
			listDto = dao.getEmpByJob(dept1,dept2);

			for(EmployeeBO boTOdto:listDto) {
				dto=new EmployeeDTO();
				BeanUtils.copyProperties(boTOdto, dto);
				listDTO.add(dto);
			}
			System.out.println("------------DTO-------------");
			System.out.println(listDTO);
			System.out.println("------------DTO-ENDs------------");
			return listDTO;
		}catch (Exception e) {
			throw e;
		}
	}

}
