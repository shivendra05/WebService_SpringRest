package com.injection;

public class EmployeePropertyInheritance{
	int eno;
	String ename;
	String address;
	String age;
	String carName;
	String CarType;
	String engineCC;
	String enginType;
	String drivingLicense;
	String aadhar;
	
	
	
	public EmployeePropertyInheritance(int eno, String ename, String address, String age, String carName,
			String carType, String engineCC, String enginType, String drivingLicense, String aadhar) {
		System.out.println("EmployeePropertyInheritance.EmployeePropertyInheritance()");
		this.eno = eno;
		this.ename = ename;
		this.address = address;
		this.age = age;
		this.carName = carName;
		CarType = carType;
		this.engineCC = engineCC;
		this.enginType = enginType;
		this.drivingLicense = drivingLicense;
		this.aadhar = aadhar;
	}



	@Override
	public String toString() {
		return "EmployeePropertyDetails [eno=" + eno + ", ename=" + ename + ", address=" + address + ", age=" + age
				+ ", carName=" + carName + ", CarType=" + CarType + ", engineCC=" + engineCC + ", enginType="
				+ enginType + ", drivingLicense=" + drivingLicense + ", aadhar=" + aadhar + "]";
	}
}