package com.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAspects {

	public Object moniter(ProceedingJoinPoint pjp ) throws Throwable {
		System.out.println("PerformanceMonitoringAspects.moniter()");
		long  startTime = System.currentTimeMillis();
		Object retValue =pjp.proceed();
		long  endTime = System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" with values "+Arrays.toString(pjp.getArgs())+ " has taken "+(endTime-startTime));

		return retValue;
	}
}