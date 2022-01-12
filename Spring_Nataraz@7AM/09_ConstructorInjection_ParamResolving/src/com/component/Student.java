package com.component;

public class Student {
	int m1;
	int m2;
	int m3;


	public Student(int m1, int m2, int m3) {
		System.out.println("Student.Student()::4 Param Construtor");
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}


	@Override
	public String toString() {
		return "Student [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}



}

