package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;
import com.vo.EmployeeVO;

public class EmployeeDepartmentTest {

	public static void main(String[] args) {
		EmployeeController controller = null;
		ApplicationContext parentCtx= null,childCtx= null;
		Scanner sn = null;
		parentCtx= new ClassPathXmlApplicationContext("com/cfgs/business-bean.xml");
		childCtx= new ClassPathXmlApplicationContext(new String[]{"com/cfgs/controller-bean.xml"},parentCtx);
		List<EmployeeVO> listvo=null;

		controller = childCtx.getBean("controller",EmployeeController.class);
		listvo= new ArrayList<EmployeeVO>();
		sn=new Scanner(System.in);
		String dept1=null,dept2=null;
		try {
			System.out.println("******** Welcome to Employee Details Portal **************");
			System.out.println("Enter Employee department name 1:: ");
			dept1 = sn.nextLine();
			System.out.println("Enter Employee department name 2:: ");
			dept2 = sn.nextLine();
			listvo = controller.getEmpDetails(dept1,dept2);
			for(EmployeeVO vo:listvo) {
				System.out.println("Your search is:: "+vo);
			}

		}catch (Exception e) {
			System.out.println("Interal Code Issue");
			e.printStackTrace();
		}
	}
}