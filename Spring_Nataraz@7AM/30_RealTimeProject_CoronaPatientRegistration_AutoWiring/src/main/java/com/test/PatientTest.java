package com.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.controller.PatientController;
import com.vo.PatientVO;

public class PatientTest {

	public static void main(String[] args) {
		PatientController controller = null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader= null;
		Scanner sn = null;
		PatientVO vo=null;
		String patientStatus=null;

		factory = new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		controller = factory.getBean("controller",PatientController.class);
		vo= new PatientVO();
		sn=new Scanner(System.in);
		
		try {
			System.out.println("******** Welcome to CORONA Test Center**************");
			System.out.println("Enter Patient Name");
			vo.setPname(sn.nextLine());
			System.out.println("Enter Patient Age");
			vo.setPage(sn.nextLine());
			System.out.println("Enter Status of fever !! (High/Low/very High)");
			vo.setFever(sn.nextLine());
			System.out.println("Enter Details of Day been Sick::");
			vo.setFromDaySick(sn.nextLine());
			System.out.println("Enter breath Issue status !!(Yes/No)");
			vo.setBreathIssue(sn.nextLine());
			System.out.println("Enter vaccine status !!(Yes/No)");
			vo.setVaccinated(sn.nextLine());

			patientStatus = controller.getPatientData(vo);
			System.out.println("Your Status is:: "+patientStatus);

		}catch (Exception e) {
			System.out.println("Interal Code Issue");
			e.printStackTrace();
		}
	}
}