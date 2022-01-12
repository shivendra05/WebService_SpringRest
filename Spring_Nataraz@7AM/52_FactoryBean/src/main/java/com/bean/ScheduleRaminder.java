package com.bean;

import java.time.LocalDate;

public class ScheduleRaminder {

	private LocalDate date;

	public ScheduleRaminder(LocalDate date) {
		this.date = date;
	}

	public String sendRemainder() {
		LocalDate dt=null;
		dt = LocalDate.now();
		System.out.println(date +" "+dt);
		if(dt.equals(date)){
			return "you have an urgent meeting with Directors";
		}else {
			return "No meeting, be free and take rest";
		}
	}
}