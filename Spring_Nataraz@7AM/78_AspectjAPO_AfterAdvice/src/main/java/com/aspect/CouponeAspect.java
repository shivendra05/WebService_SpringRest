package com.aspect;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class CouponeAspect {

	public void couponGeneration(JoinPoint jp, float billAmount) throws Exception {
		System.out.println("CouponeAspect.couponGeneration()");
		String msg=null;
		
		if(billAmount>1000000) {
			msg="You are eligible for 40% Offers";
			billAmount = billAmount-40;
		}
		else if(billAmount>100000) {
			msg="You are eligible for 30% Offers";
			billAmount = billAmount-30;
		}
		else if(billAmount>10000) {
			msg="You are eligible for 20% Offers";
			billAmount = billAmount-20;
		}else if(billAmount>1000) {
			msg="You are eligible for 10% Offers";
			billAmount = billAmount-10;
		}else
			msg="No Offers for You";
		
		FileWriter writer = new FileWriter("F:\\Spring_Nataraz@7AM\\coupon.txt");
		writer.write(msg);
		writer.flush();
		writer.close();
		System.out.println("done");
	}
}