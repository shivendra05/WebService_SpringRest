package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.PatientBO;
import com.dao.PatientDAO;
import com.dto.PatientDTO;

@Service
public class PatientServiceImpl implements PatientService {
	String status;
	
	@Autowired
	PatientDAO dao;

	/*PatientServiceImpl(PatientDAO dao){
		System.out.println("PatientServiceImpl.PatientServiceImpl()");
		this.dao=dao;
	}*/

	@Override
	public String patientTypeOfDisease(PatientDTO dto) throws Exception {
		String statusOfTest=null;
		PatientBO bo=null;

		bo= new PatientBO();

		if(dto.getPage()>50 && dto.getFever().equalsIgnoreCase("High") && 
				dto.getFromDaySick()>7 && dto.getVaccinated().equalsIgnoreCase("No")){
			statusOfTest = "Sevier,COVID POSITIVE";
		} else if(dto.getPage()>90 && dto.getFever().equalsIgnoreCase("Very High") && 
				dto.getFromDaySick()>10 && dto.getVaccinated().equalsIgnoreCase("No")){
			statusOfTest = "Sorry,Cant Help. COVID POSITIVE";
		}else if(dto.getPage()>40 && dto.getFever().equalsIgnoreCase("Normal") && 
				dto.getFromDaySick()>7 && dto.getVaccinated().equalsIgnoreCase("No")){
			statusOfTest = "Mild,COVID POSITIVE";
		}else if(dto.getPage()<30 && dto.getFever().equalsIgnoreCase("Normal") && 
				dto.getFromDaySick()>3 && dto.getVaccinated().equalsIgnoreCase("No")){
			statusOfTest = "Careful, Corona Nagetive";
		}else {
			statusOfTest = "Corona Nagetive";
		}

		bo.setPname(dto.getPname());
		bo.setPage(dto.getPage());
		bo.setVaccinated(dto.getVaccinated());
		bo.setFever(dto.getFever());
		bo.setFromDaySick(dto.getFromDaySick());
		bo.setBreathIssues(dto.getBreathIssue());
		bo.setStatusCorona(statusOfTest);

		status = dao.InsertCoronaPatientDetials(bo);

		if(status.contains("POSITIVE"))
			return "COVID POSITIVE," +"\n" +"Hey!! Start taking of YourSelf. Dont GO OUT and Get Well Soon";
		else
			return "COVID Nagetive, \n  Hurray!! Enjoy.. bear Mask and Be in Distance";
	}
}