package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.bo.PatientBO;

@Repository
public class PatientDAOImpl implements PatientDAO {
	private static final String INSERT_PATIENT_DETAILS="INSERT INTO PATIENT_DETAILS VALUES(coronaPatient_no.NEXTVAL,?,?,?,?,?,?,?)";
	
	@Autowired
	@Qualifier("hDSProp")
	DataSource ds;

	@Override
	public String InsertCoronaPatientDetials(PatientBO bo) throws Exception {
		int count=0;
		Connection con=null;
		PreparedStatement ps= null;

		con = ds.getConnection();
		ps = con.prepareStatement(INSERT_PATIENT_DETAILS);

		System.out.println("Col1::"+ bo.getPname());
		System.out.println("Col2::"+ bo.getPage());
		System.out.println("Col3::"+ bo.getVaccinated());
		System.out.println("Col4::"+ bo.getFever());
		System.out.println("Col5::"+ bo.getFromDaySick());
		System.out.println("Col6::"+ bo.getBreathIssues());
		System.out.println("Col7::"+ bo.getStatusCorona());

		ps.setString(1, bo.getPname());
		ps.setInt(2, bo.getPage());
		ps.setString(3, bo.getVaccinated());
		ps.setString(4, bo.getFever());
		ps.setInt(5, bo.getFromDaySick());
		ps.setString(6, bo.getBreathIssues());
		ps.setString(7, bo.getStatusCorona());

		count = ps.executeUpdate();
		System.out.println(count);

		ps.close();
		con.close();

		if(bo.getStatusCorona().contains("POSITIVE"))
			return "POSITIVE.. Take care, else you May Die";
		else
			return "Nagetive.. you safe But bear mask";
	}
}