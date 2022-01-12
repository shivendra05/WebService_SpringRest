package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/show")
	public String showEmployeeData(Model model) {
		model.addAttribute("id",100);
		model.addAttribute("name","shivendra");
		model.addAttribute("age",32);
		
		return "employee";
	}
}