package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Product;
import com.example.service.ProductService;

@Controller
public class ProdController {

	@Autowired
	ProductService service;

	@RequestMapping("/productHome")
	public String registerProd() {
		System.out.println("ProdController.registerProd():: Home");
		return "register";
	}


	@RequestMapping(value = "/userRegister", method = RequestMethod.POST)
	public String saveData(
			@ModelAttribute Product prod,//UI to Model
			Model model) { //Model to UI
		System.out.println("ProdController.saveData()::Save Data");
		String msg = service.inserData(prod);
		String prodMSg = msg+" with ProductID -->"+prod.getId();
		long rows = service.getRowCount();
		model.addAttribute("ProdId", prodMSg);
		model.addAttribute("UserData", prod);
		model.addAttribute("rowsCount", rows);
		return "register";
	}

	@RequestMapping("/all")
	public String getAllData(
			@ModelAttribute Product prod,//UI to Model
			Model model) {	//Model to UI
		System.out.println("ProdController.getAllData():: All Data***********************");
		List<Product> prodList = service.showAllData();
		System.out.println(prodList);
		model.addAttribute("prodList", prodList);
		System.out.println("ProdController.getAllData():: All Data***********************");
		return "usersData";
	}
	
	@RequestMapping("/delete")
	public String deleteProductByID(
			@ModelAttribute("id") int pid,//UI to Model
			Model model) {	//Model to UI
		System.out.println("ProdController.deleteProductByID():: Delete***********************");
		String deleteMSG = service.deleteProductByID(pid);
		System.out.println(deleteMSG);
		model.addAttribute("deleteMSG", deleteMSG);
		List<Product> prodList = service.showAllData();
		System.out.println(prodList);
		model.addAttribute("prodList", prodList);
		
		System.out.println("ProdController.deleteProductByID():: Delete***********************");
		return "usersData";
	}
}
