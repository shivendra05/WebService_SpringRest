package com.component;

public class B {
	A a;

	public B(A a) {
		System.out.println("B.B()");
		this.a=a;
	}

	@Override
	public String toString() {
		return "B [a=" ;
	}
}