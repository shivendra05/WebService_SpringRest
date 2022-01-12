package com.component;

public class A {
	B b;

	public A(B b) {
		System.out.println("A.A()");
		this.b=b;
	}
	
	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
}