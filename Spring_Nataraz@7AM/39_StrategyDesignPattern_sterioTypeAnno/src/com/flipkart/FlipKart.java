package com.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.payment.PaymentMode;

@Component("flip")
public class FlipKart {
	//target class
	
	@Autowired
	PaymentMode payment;

	public void doShopping() {
		String yourOurder = payment.doPayment(new String[] {"Jeans","sihrt"}, new double []{21.32,4354.32});
		System.out.println(yourOurder);
	}

}
