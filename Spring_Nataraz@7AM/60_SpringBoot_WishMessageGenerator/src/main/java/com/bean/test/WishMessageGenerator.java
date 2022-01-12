package com.bean.test;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessageGenerator {
	@Autowired
	LocalTime time;
	
	public String wishMessage(String uName) {
		if(time.getHour()<12)
			return "Good Morning: "+uName;
		else if(time.getHour()<16)
			return "Good Afternoon: "+uName;
		else if(time.getHour()<20)
			return "Good Evening: "+uName;
		else
			return "Good Night: "+uName;
	}
}