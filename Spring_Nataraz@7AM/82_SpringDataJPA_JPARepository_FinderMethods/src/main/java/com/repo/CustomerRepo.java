package com.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.CustomerDetails;

public interface CustomerRepo extends JpaRepository<CustomerDetails,Integer> {

	public List<CustomerDetails> findByCadd(String cadd);
	public List<CustomerDetails> findByCname(String cname);
	public List<CustomerDetails> findBybillAmountGreaterThan(Double bill);
	public List<CustomerDetails> findByCnoIn(Collection<Integer>  no);
}