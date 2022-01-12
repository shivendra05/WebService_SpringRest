package com.example.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;

@RestController
@RequestMapping("/rest/product")
public class ProductController {	

	@PostMapping("/all")
	public ResponseEntity<String> createProduct(
			@RequestBody Product prod){

		String msg = prod.toString();
		ResponseEntity<String> resMSG = new ResponseEntity<String>(msg, HttpStatus.OK);
		return resMSG;
	}
	
	
	@GetMapping("/getInfo")
	public ResponseEntity<Product> getProduct() {
		
		Product prod = new Product();
		prod.setProdId(101);
		prod.setPrice(3243.43);
		prod.setProdName("english Book");
		prod.setQuantity(32);
		
		ResponseEntity<Product> msg = new ResponseEntity<Product>(prod, HttpStatus.OK);
		return msg;
	}
}
