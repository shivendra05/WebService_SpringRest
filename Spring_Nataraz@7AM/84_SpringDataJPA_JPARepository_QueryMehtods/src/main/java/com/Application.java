package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.CustomerDetails;
import com.repo.CustomerRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		CustomerRepo repo= null;
		ApplicationContext ctx= null;
		Iterable<CustomerDetails> details=null;
		Iterable<Object[]> custValues=null;
		ctx = SpringApplication.run(Application.class, args);
		repo = ctx.getBean(CustomerRepo.class);

		try {
			System.out.println("--------------Get All Customers------------------");
			details = repo.getCustomers();
			details.forEach(System.out::println);
			System.out.println("--------------Get By Address/City------------------");
			details = repo.getCustomersByAddr("rewa");
			System.out.println("--------------Get By ID------------------");
			details = repo.getCustomersByID(42);
			details.forEach(System.out::println);
			System.out.println("--------------Get By between------------------");
			details = repo.getCustomersByIDBetween(41, 43);
			details.forEach(System.out::println);
			System.out.println("--------------Get By In------------------");
			details = repo.getCustomersByIDBetween(40, 43);
			details.forEach(System.out::println);
			System.out.println("--------------Get By like------------------");
			details = repo.getCustomersByLike();
			details.forEach(System.out::println);
			System.out.println("--------------Get By range- namedparam------------------");
			details = repo.getCustomersByIDInRange(40, 43);
			details.forEach(System.out::println);
			System.out.println("--------------Get cNO and cAdd------------------");
			custValues = repo.getCnocAddeByLike();
			for (Object[] objects : custValues) {
				System.out.println(objects[0].toString()+"  -  "+objects[1].toString());;
			}
			System.out.println("--------------Get cadd------------------");
			Iterable<String> cname = repo.getcNoByID(42);
			cname.forEach(System.out::println);

			/*System.out.println("--------------Update billamount cadd------------------");
			Iterable<Object[]> cvalues = repo.modifyBillAmount(1,"rewa");
			for (Object[] objects : cvalues) {
				System.out.println(objects[0].toString()+"  -  "+objects[1].toString());;
			}*/

			/*	System.out.println("--------------delete customer------------------");
				int status = repo.deleteByID(42);
				System.out.println("record deleted:: "+status);
			
				*/
			System.out.println("--------------NativeQuery------------------");
			Iterable<CustomerDetails> custoValues= repo.getByAddress("rewa");
			custoValues.forEach(System.out::println);	
			
			System.out.println("--------------NativeQuery get system Date------------------");
			System.out.println(repo.getSystemDate());;
			
			System.out.println("--------------procedure calls------------------");
			System.out.println(repo.getCustName(43,""));;
		}catch (Exception e) {

			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
