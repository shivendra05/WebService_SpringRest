package com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.repo.CustomerRepo;
import com.repo.CustomerRepo.QuerySearchResults;
import com.repo.CustomerRepo.QuerySearchResults1;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= null;
		CustomerRepo custRepo = null;
		ctx= SpringApplication.run(Application.class, args);
		custRepo = ctx.getBean(CustomerRepo.class);
		List<QuerySearchResults> result=null;
		try {
			System.out.println("------static--------Find by Cadd-----------");
			result = custRepo.findByCno(41);
			result.forEach(values->{
				values.getcadd();
				System.out.println(values.getcadd());
				System.out.println(values.getcname()) ;
			});
			
			System.out.println("-----static---------Find between id-----------");
			result = custRepo.findByCnoBetween(41,43);
			
			result.forEach(values->{
				System.out.println(values.getcadd()+"  "+values.getcname());
			});
			
			System.out.println("--------Dynemic------Find between id-----------");
			List<QuerySearchResults> search= custRepo.findBycno(42, QuerySearchResults.class);
			search.forEach(values->{
				System.out.println(values.getcadd()+"  "+values.getcname());
			});
			
			System.out.println("--------Dynemic------Find between id-----------");
			List<QuerySearchResults1> search1= custRepo.findBycno(44, QuerySearchResults1.class);
			search1.forEach(values->{
				System.out.println(values.getcno()
						+"  "+values.getcadd());
			});
		}catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}
}