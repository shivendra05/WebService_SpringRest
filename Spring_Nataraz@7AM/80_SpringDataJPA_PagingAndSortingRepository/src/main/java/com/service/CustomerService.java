package com.service;

import java.util.List;

import com.dto.CustomerDTO;
import com.entity.CustomerDetails;

public interface CustomerService {

	public String registerCustomer(CustomerDTO dto);
	
	public String registerMultipleCustomer(List<CustomerDTO> dtoList);
	
	public List<CustomerDetails> sortCustomerData(String property);
	
	public List<CustomerDetails> sortCustomerDataOnGivenOrder(String property,String order);
}
