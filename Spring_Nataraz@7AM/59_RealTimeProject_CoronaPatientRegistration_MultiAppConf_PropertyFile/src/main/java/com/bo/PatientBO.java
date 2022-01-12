package com.bo;

public class PatientBO {

	int pno;
	String pname;
	int page;
	String vaccinated;
	String fever;
	int fromDaySick;
	String statusCorona;
	String breathIssues;
	
	public String getBreathIssues() {
		return breathIssues;
	}

	public void setBreathIssues(String breathIssues) {
		this.breathIssues = breathIssues;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
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

	public int getFromDaySick() {
		return fromDaySick;
	}

	public void setFromDaySick(int fromDaySick) {
		this.fromDaySick = fromDaySick;
	}

	public String getStatusCorona() {
		return statusCorona;
	}

	public void setStatusCorona(String statusCorona) {
		this.statusCorona = statusCorona;
	}

	@Override
	public String toString() {
		return "PatientBO [pname=" + pname + ", page=" + page + ", vaccinated=" + vaccinated + ", fever=" + fever
				+ ", fromDaySick=" + fromDaySick + ", statusCorona=" + statusCorona + "]";
	}
}