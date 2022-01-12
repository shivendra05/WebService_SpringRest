package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.dto.CustomerDTO;
import com.entity.CustomerDetails;
import com.service.CustomerService;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= null;
		CustomerService service = null;
		CustomerDTO dto=null;
		List<CustomerDTO> listDTO= null;
		List<CustomerDetails> sortedCust=null;
		
		ctx= SpringApplication.run(Application.class, args);
		service = ctx.getBean("custService",CustomerService.class);
		
		try {
			dto= new CustomerDTO();
			dto.setCname("shivendra");
			dto.setCadd("rewa");
			dto.setBillAmount(213443.43);
			String msg = service.registerCustomer(dto);
			System.out.println(msg);

			System.out.println("=================List===========================");
			listDTO= new ArrayList<>();
			
			dto= new CustomerDTO();
			dto.setCname("aman");
			dto.setCadd("rewa");
			dto.setBillAmount(1234.43);
			listDTO.add(dto);
			
			dto= new CustomerDTO();
			dto.setCname("abc");
			dto.setCadd("satna");
			dto.setBillAmount(43543.43);
			listDTO.add(dto);

			dto= new CustomerDTO();
			dto.setCname("abid");
			dto.setCadd("kerala");
			dto.setBillAmount(3254.43);
			listDTO.add(dto);

			dto= new CustomerDTO();
			dto.setCname("abcina");
			dto.setCadd("gwalior");
			dto.setBillAmount(3245.43);
			listDTO.add(dto);

			service.registerMultipleCustomer(listDTO);
			
			System.out.println("==================search=1===========");
			sortedCust = new ArrayList<>();
			
			sortedCust = service.sortCustomerData("cname");
			sortedCust.forEach(cust->System.out.println(cust));
			
			System.out.println("==================search=2===========");
			sortedCust = new ArrayList<>();
			
			sortedCust = service.sortCustomerDataOnGivenOrder("cname","DSC");
			sortedCust.forEach(cust->System.out.println(cust));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}
}