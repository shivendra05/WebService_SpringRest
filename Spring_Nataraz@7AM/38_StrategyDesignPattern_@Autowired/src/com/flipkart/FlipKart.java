package com.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.payment.PaymentMode;

public class FlipKart {
	//target class
	
	@Autowired
	//@Qualifier(value = "dtdcbean")
	//@Qualifier("dtdcbean")
	PaymentMode payment;

	/*public PaymentMode getPayment() {
		return payment;
	}
	 
	public void setPayment(PaymentMode payment) {
		this.payment = payment;
	}*/

	public void doShopping(String mode) {
		String yourOurder = payment.doPayment(new String[] {"Jeans","sihrt"}, new double []{21.32,4354.32});
		System.out.println(yourOurder);
	}

}
