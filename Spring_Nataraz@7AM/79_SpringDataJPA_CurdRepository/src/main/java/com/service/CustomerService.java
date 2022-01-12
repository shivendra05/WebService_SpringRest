package com.service;

import java.util.List;

import com.dto.CustomerDTO;
import com.entity.CustomerDetails;

public interface CustomerService {

	public String registerCustomer(CustomerDTO dto);
	
	public String registerMultipleCustomer(List<CustomerDTO> dtoList);
}
