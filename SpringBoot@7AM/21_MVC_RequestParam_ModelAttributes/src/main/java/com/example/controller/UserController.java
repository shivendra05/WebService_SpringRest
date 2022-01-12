package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.UserData;

@Controller
public class UserController {

	@RequestMapping("/register")
	public String userRegistration() {
		
		return "login";
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public String userRegistration(
			@ModelAttribute UserData user,
			Model model) {
		
		model.addAttribute("empDetails", user);
		
		return "userData";
	}
}