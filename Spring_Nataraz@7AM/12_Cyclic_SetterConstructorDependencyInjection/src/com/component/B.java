package com.component;

public class B {
	A a;

	public A getA() {
		System.out.println("B.getA()");
		return a;
	}

	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" ;
	}
}