package com.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateInterest_Replacer implements MethodReplacer{

	CalculateInterest_Replacer(){
		System.out.println("CalculateInterest_Replacer.CalculateInterest_Replacer():: 0 Param");
	}
	public float calInterest(float pAmount, float rate, float time) {

		return (pAmount*rate*time/100);
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

		float pAmount=(float)args[0]; 
		float rate =(float)args[1];
		float time = (float)args[2];
		
		return (pAmount*rate*time/100);
	}
}
