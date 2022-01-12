package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.CustomerDTO;
import com.entity.CustomerDetails;
import com.repo.CustomerRepo;

@Service("custService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo custRepo;
	
	@Override
	public String registerCustomer(CustomerDTO dto) {
		CustomerDetails cust= null;
		cust= new CustomerDetails();
		
		BeanUtils.copyProperties(dto, cust);
		cust = custRepo.save(cust);
		
		return cust!=null?"Object Saved with id:: "+cust.getCno():"Object Saved";
	}

	@Override
	public String registerMultipleCustomer(List<CustomerDTO> dtoList) {
		List<CustomerDetails> custList= null,custList1= null;
		custList= new ArrayList<>();
		CustomerDetails cust=null;
		String ids=null;
		for (CustomerDTO customerDetails : dtoList) {
			cust= new CustomerDetails();
			BeanUtils.copyProperties(customerDetails, cust);
			custList.add(cust);
		}
		
		custList1 = (List<CustomerDetails>) custRepo.saveAll(custList);
		
		for (CustomerDetails custid : custList1) {
			ids = ids+" "+custid.getCno();
			System.out.println(custid.getCno());;
		}
		
		return custList1!=null?"Object Saved with id:: "+ids:"Object Saved";
	}
}