package com.aspect;

import org.aspectj.lang.JoinPoint;

import com.manager.AuthenticationManager;

public class SecurityCheckAspect {
	private AuthenticationManager manager;
	
	SecurityCheckAspect(AuthenticationManager manager){
		this.manager=manager;
	}
	
	public void check(JoinPoint jp) {
		if(!manager.validate())
			throw new IllegalArgumentException("bad/invalid credentials");
	}
}