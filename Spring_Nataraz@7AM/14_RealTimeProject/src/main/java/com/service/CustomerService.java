package com.service;

import com.dto.CustomerDTO;

public interface CustomerService {

	public String claculateInterestAmount(CustomerDTO dto) throws Exception;
}
