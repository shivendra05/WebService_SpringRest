package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.EmployeeModel;

@Controller
public class DataStructureController {

	@RequestMapping("/UserData")
	public String getData(Model model) {
		EmployeeModel emp = null;
		emp =  new EmployeeModel();
		
		emp.setEId(100);
		emp.setEname("pandey");
		emp.setAge(43);
		
		List list = List.of(12, 23, 34, 45, 56, 67, 78, "A", "B", "C");
		Map map = Map.of("fName","shivendra","lName","Pandey","age",32,"Residance","Rewa");
		
		model.addAttribute("NumList", list);
		model.addAttribute("NumMap", map);
		model.addAttribute("employee", emp);
		
		return "Data";
	}
}
