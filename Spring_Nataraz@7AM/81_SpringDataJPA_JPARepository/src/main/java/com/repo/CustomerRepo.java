package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.CustomerDetails;

public interface CustomerRepo extends JpaRepository<CustomerDetails,Integer> {


}
