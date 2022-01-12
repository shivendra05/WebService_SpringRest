package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.repo.CustomerRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= null;
		CustomerRepo custRepo = null;
List< Integer> list = null;
		ctx= SpringApplication.run(Application.class, args);
		custRepo = ctx.getBean(CustomerRepo.class);
		list = new ArrayList<>();
		
		try {
			System.out.println("--------------Find by Cadd-----------");
			custRepo.findByCadd("rewa").forEach(	System.out::println);
			System.out.println("--------------Find by Cname-----------");
			custRepo.findByCname("shivendra").forEach(System.out::println);
			System.out.println("--------------Find by BillAmount GraterThan-----------");
			custRepo.findBybillAmountGreaterThan(3211.32).forEach(System.out::println);	
			System.out.println("--------------Find by CNo In-----------");
			list.add(41);
			list.add(42);
			list.add(21);
			custRepo.findByCnoIn(list).forEach(System.out::println);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}
}