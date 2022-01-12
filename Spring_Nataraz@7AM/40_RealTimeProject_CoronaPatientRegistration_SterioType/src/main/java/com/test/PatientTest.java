package com.test;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.controller.PatientController;
import com.vo.PatientVO;


public class PatientTest {

	public static void main(String[] args) {
		PatientController controller = null;
		Scanner sn = null;
		PatientVO vo=null;
		String patientStatus=null;
		ApplicationContext ctx= null;

		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		//controller = ctx.getBean("controller",PatientController.class);
		controller = ctx.getBean(PatientController.class);
		vo= new PatientVO();
		sn=new Scanner(System.in);

		try {
			System.out.println("******** Welcome to CORONA Test Center**************");
			System.out.println("Enter Patient Name");
			vo.setPname(sn.nextLine());
			System.out.println("Enter Patient Age");
			vo.setPage(sn.nextLine());
			System.out.println("Enter Status of fever !! (High/low/Normal)");
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
		((AbstractApplicationContext) ctx).close();
	}
}