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
		ctx= SpringApplication.run(Application.class, args);
		service = ctx.getBean("custService",CustomerService.class);
		List<CustomerDTO> listDTO= null;

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
			dto.setCname("shivendra");
			dto.setCadd("rewa");
			dto.setBillAmount(432.43);
			listDTO.add(dto);
			
			dto= new CustomerDTO();
			dto.setCname("shiv");
			dto.setCadd("bpl");
			dto.setBillAmount(213443.43);
			listDTO.add(dto);

			dto= new CustomerDTO();
			dto.setCname("pandey");
			dto.setCadd("hyd");
			dto.setBillAmount(32432.43);
			listDTO.add(dto);

			dto= new CustomerDTO();
			dto.setCname("shibbu");
			dto.setCadd("gwalior");
			dto.setBillAmount(4398349.43);
			listDTO.add(dto);

			service.registerMultipleCustomer(listDTO);
		}catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}
}