package com.component;

public class Employee {
	int id;
	float salary;
	String name;

	public Employee(int id, String name, float salary) {
		System.out.println("Employee.Employee()::3 param constrcotr");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}