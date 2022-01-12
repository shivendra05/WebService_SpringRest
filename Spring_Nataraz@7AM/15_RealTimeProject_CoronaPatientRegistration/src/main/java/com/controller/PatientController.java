package com.controller;

import com.dto.PatientDTO;
import com.service.PatientService;
import com.vo.PatientVO;

public class PatientController {
	
	PatientVO vo=null;
	PatientDTO dto=null;
	PatientService service;
	String patientStatus;
	
	PatientController(PatientService service){
		System.out.println("PatientController.PatientController()");
		this.service=service;
	}
	
	public String getPatientData(PatientVO vo) throws Exception{
		
		dto= new PatientDTO();
		
		dto.setPname(vo.getPname());
		dto.setPage(Integer.parseInt(vo.getPage()));
		dto.setVaccinated(vo.getVaccinated());
		dto.setFever(vo.getFever());
		dto.setFromDaySick(Integer.parseInt(vo.getFromDaySick()));
		dto.setBreathIssue(vo.getBreathIssue());
		
		patientStatus = service.patientTypeOfDisease(dto);
		
		return patientStatus;
	}
}
