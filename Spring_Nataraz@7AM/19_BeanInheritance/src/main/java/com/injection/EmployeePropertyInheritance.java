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
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public String getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public String getEnginType() {
		return enginType;
	}
	public void setEnginType(String enginType) {
		this.enginType = enginType;
	}
	public String getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "EmployeePropertyDetails [eno=" + eno + ", ename=" + ename + ", address=" + address + ", age=" + age
				+ ", carName=" + carName + ", CarType=" + CarType + ", engineCC=" + engineCC + ", enginType="
				+ enginType + ", drivingLicense=" + drivingLicense + ", aadhar=" + aadhar + "]";
	}
}