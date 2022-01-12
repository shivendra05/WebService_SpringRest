package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.dto.CustomerDTO;
import com.entity.CustomerDetails;
import com.repo.CustomerRepo;

@Service("custService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo custRepo;

	@Override
	public List<CustomerDTO> getCustomerDetails(CustomerDTO dto) {
		CustomerDetails details=null;
		Example<CustomerDetails> example=null;
		List<CustomerDetails> listCust = null;
		List<CustomerDTO> listCustDTO = new ArrayList<>();
		
		details = new CustomerDetails();
		listCust = new ArrayList<>();
		BeanUtils.copyProperties(dto, details);
		example = Example.of(details);
		
		listCust = custRepo.findAll(example);
		
		listCust.forEach(liCust->{
			CustomerDTO cust = new CustomerDTO();
			BeanUtils.copyProperties(liCust, cust);
			listCustDTO.add(cust);
		});
		
		return listCustDTO;
	}

	@Override
	public String deleteRecordsInBatch() {
		boolean flag=false;
		if (custRepo.count()>=1) {
			custRepo.deleteAll();
			flag=true;
		}
		
		if(flag==true)
			return "All Records are deleted";
		else
			return "There is no records in the table";
	}
	
}