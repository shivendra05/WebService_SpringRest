package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
		empRepo.save(new Employee(10,"A",32));
		empRepo.save(new Employee(11,"B",33));
		empRepo.save(new Employee(12,"C",34));
		empRepo.save(new Employee(13,"D",35));
		System.out.println("DONE");	
	}
}
