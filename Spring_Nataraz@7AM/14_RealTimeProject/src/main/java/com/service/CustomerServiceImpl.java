package com.service;

import com.bo.CustomerBO;
import com.dao.CustomerDAO;
import com.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO dao=null;

	CustomerServiceImpl(CustomerDAO dao){
		this.dao=dao;
	}

	@Override
	public String claculateInterestAmount(CustomerDTO dto) throws Exception {
		float amount =0.0f;
		CustomerBO bo=null;
		String status=null;

		bo= new CustomerBO();
		amount =dto.getPamount()*dto.getTime()*dto.getRate()/100;

		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamount(dto.getPamount());
		bo.setIntamount(amount);

		status = dao.insert(bo);
		if(status.equals("Pass"))
			return "Data Inserted Successfuly:: Principle Amount: "+dto.getPamount() +" and Interst Amount: "+amount;
		else
			return "Failed to Insert Data";
	}
}