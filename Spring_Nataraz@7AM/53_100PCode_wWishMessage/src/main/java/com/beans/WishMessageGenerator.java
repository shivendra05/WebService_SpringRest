package com.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wishmsg")
public class WishMessageGenerator {
	@Autowired
	Date date;

	public String wishMessage(String uName) {
		if(date.getHours()<12)
			return "Good Morning:: "+uName;
		else if(date.getHours()<16)
			return "Good Afternoon:: "+uName;
		else if(date.getHours()<20)
			return "Good Evening:: "+uName;
		else
			return "Good Night:: "+uName;
	}
}
