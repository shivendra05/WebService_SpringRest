package com.bean;

import java.util.Date;

public class WishMessage {
	//bean property
	public Date date;

	//setter/getters
	public void setDate(Date date) {
		this.date=date;
	}

	//business method
	public String wishGenerate(String uName) {
		int hour = date.getHours();
		if(hour<=12)
			return "Good Morning--"+uName;
		else if(hour<=16)
			return "Good AfterNoon--"+uName;
		else if(hour<=20)
			return "Good Evening--"+uName;
		else
			return "Good Night--"+uName;
	}
}