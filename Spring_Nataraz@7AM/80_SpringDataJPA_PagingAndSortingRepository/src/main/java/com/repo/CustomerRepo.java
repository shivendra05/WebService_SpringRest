package com.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.entity.CustomerDetails;

public interface CustomerRepo extends PagingAndSortingRepository<CustomerDetails,Integer> {


}
