package com.bo;

import java.io.Serializable;

public class CustomerBO{
	private String cname;
	private String cadd;
	private float pamount;
	private float intamount;
	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public float getPamount() {
		return pamount;
	}

	public void setPamount(float pamount) {
		this.pamount = pamount;
	}

	public float getIntamount() {
		return intamount;
	}

	public void setIntamount(float intamount) {
		this.intamount = intamount;
	}
}