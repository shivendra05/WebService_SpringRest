package com.component;

public class A {
	B b;

	
	/*public B getB() {
		System.out.println("A.getB()");
		return b;
	}
	
	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}*/

	public A(B b) {
		System.out.println("A.A()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [a=";
	}
}