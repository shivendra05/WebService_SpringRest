package com.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
	private String cname;
	private String cadd;
	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	private float pamount;
	private float rate;
	private float time;
	
	
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

}