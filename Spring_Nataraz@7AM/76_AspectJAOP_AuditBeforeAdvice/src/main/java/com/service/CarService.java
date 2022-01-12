package com.service;

public class CarService {
	
	public String sale(String model, float price, String executives) {
		
		if(model.equalsIgnoreCase("baleno") || model.equalsIgnoreCase("birza") )
		return model + " car sold out having "+price+" by executive "+executives;
		else
			return model+" car is NOT available for sale";
	}

}
