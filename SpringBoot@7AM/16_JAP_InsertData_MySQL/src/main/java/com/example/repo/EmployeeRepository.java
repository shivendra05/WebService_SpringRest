package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
