package com.vo;

public class PatientVO {
	String pname;
	String page;
	String vaccinated;
	String fever;
	String fromDaySick;
	String breathIssue;
	
	public String getBreathIssue() {
		return breathIssue;
	}

	public void setBreathIssue(String breathIssue) {
		this.breathIssue = breathIssue;
	}

	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getPage() {
		return page;
	}
	
	public void setPage(String page) {
		this.page = page;
	}
	
	public String getVaccinated() {
		return vaccinated;
	}
	
	public void setVaccinated(String vaccinated) {
		this.vaccinated = vaccinated;
	}
	
	public String getFever() {
		return fever;
	}
	
	public void setFever(String fever) {
		this.fever = fever;
	}
	
	public String getFromDaySick() {
		return fromDaySick;
	}
	
	public void setFromDaySick(String fromDaySick) {
		this.fromDaySick = fromDaySick;
	}

	@Override
	public String toString() {
		return "PatientVO [pname=" + pname + ", page=" + page + ", vaccinated=" + vaccinated + ", fever=" + fever
				+ ", fromDaySick=" + fromDaySick;
	}
}
