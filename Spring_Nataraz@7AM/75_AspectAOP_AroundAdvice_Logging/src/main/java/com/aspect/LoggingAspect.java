package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	public Object logging(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("LoggingAspect.logging()");
		long startTime = System.currentTimeMillis();
		Object obj = pjp.proceed();
		long endTime = System.currentTimeMillis();
		
		System.out.println(obj.getClass()+" values returen for params "+" Time takne"+(endTime-startTime));
		return obj;		
	}
}