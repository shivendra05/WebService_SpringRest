package com.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dto.CustomerDTO;
import com.entity.CustomerDetails;

public interface CustomerRepo extends CrudRepository<CustomerDetails,Integer> {


}
