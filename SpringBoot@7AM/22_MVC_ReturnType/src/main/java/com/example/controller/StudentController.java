package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/showData")
	public String getShow() {

		return "data";
	}

	@RequestMapping("/showModelAndViewData")
	public ModelAndView getOldData() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "shivendra");
		mav.setViewName("showOldData");
		return mav;
	}


	@RequestMapping("/showModelData")
	public String getModelShow(Model model) {
		model.addAttribute("age", 32);
		model.addAttribute("id", 10001);
		return "showModelData";
	}

	/*
	 * @RequestMapping("/showData")
	 * public String getShow() {
	 * 
	 * return "data";
	 * }
	 */


}
