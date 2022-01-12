package com.component;

public class Student {
	String sName;
	int age;
	String address;
	String grade;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	public Student(String sName, int age, String address, String grade) {
		this.sName = sName;
		this.age = age;
		this.address = address;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", age=" + age + ", address=" + address + ", grade=" + grade + "]";
	}
}

