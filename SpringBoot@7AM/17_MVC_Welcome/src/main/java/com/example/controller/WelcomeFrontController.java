package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeFrontController {

	@RequestMapping("/show")
	public String showMessage() {
		return "welcome";
	}
}