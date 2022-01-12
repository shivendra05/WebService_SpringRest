package com.fligkart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.payment.PaymentMode;

public class FlipKart {

	static Properties pro =null;
	static PaymentMode payment=null;
		
	private static void setPaymentMode(PaymentMode modeOfPayment) {
		payment = modeOfPayment;		
	}
	static {
		try {
			pro = new Properties();
			//F:\Spring_Nataraz@7AM\04_StrategyDesignPattern\src\com\resources
			pro.load(new FileInputStream("src\\com\\resources\\courierDetails.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};

	}

	public static PaymentMode doShopping() throws Exception, IllegalAccessException, ClassNotFoundException {
		PaymentMode modeOfPayment = null;
		modeOfPayment =(PaymentMode) Class.forName(pro.getProperty("curier.dtdc")).newInstance();
		setPaymentMode(modeOfPayment);

		String yourOurder = payment.doPayment(new String[] {"Jeans","sihrt"}, new double []{21.32,4354.32});
		System.out.println(yourOurder);
		return modeOfPayment;
	}


}
