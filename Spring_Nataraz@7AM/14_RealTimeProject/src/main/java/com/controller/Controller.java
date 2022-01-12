package com.controller;

import com.dto.CustomerDTO;
import com.service.CustomerService;
import com.vo.CustomerVO;

public class Controller {

	CustomerService service=null;
	Controller(CustomerService service){
		this.service=service;
	}
	
	public String findInterest(CustomerVO vo) throws Exception{
		CustomerDTO dto;

		dto= new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamount(Float.parseFloat(vo.getPamount()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		String status = service.claculateInterestAmount(dto);
		
		return status;
	}
}
