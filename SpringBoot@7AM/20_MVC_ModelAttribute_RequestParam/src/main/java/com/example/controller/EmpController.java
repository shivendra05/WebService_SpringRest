package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Employee;

@Controller
public class EmpController {

	@RequestMapping("/userLogin")
	private String empLogin() {
		return "registration";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	private String getEmployee(
			@ModelAttribute Employee emp,
			Model model) {
		
		model.addAttribute("empData", emp);
		
		return "homePage";
	}
}