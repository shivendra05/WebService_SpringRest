package com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.dto.CustomerDTO;
import com.service.CustomerService;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= null;
		CustomerService service = null;
		CustomerDTO dto=null;
		
		ctx= SpringApplication.run(Application.class, args);
		service = ctx.getBean("custService",CustomerService.class);
		
		try {
			dto= new CustomerDTO();
			dto.setCname("shivendra");
			//dto.setCadd("rewa");
			List<CustomerDTO> msg = service.getCustomerDetails(dto);
			System.out.println(msg);
			msg.forEach(cust->System.out.println(cust));
			
			System.out.println("--------------------------");
			
			String recordDelete = service.deleteRecordsInBatch();
			System.out.println(recordDelete);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}
}