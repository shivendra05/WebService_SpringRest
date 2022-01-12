package com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.controller.EmployeeController;
import com.vo.EmployeeVO;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= null;
		EmployeeController controller=null;
		List<EmployeeVO> listVo = null;
		//SpringApplication app = new SpringApplication();
		//app.setBannerMode(org.springframework.boot.Banner.Mode.CONSOLE);
		ctx= SpringApplication.run(Application.class, args);
		controller = ctx.getBean("controller",EmployeeController.class);
		listVo = controller.getEmpDetails("QA", "teacher");
		listVo.forEach(vo->System.out.println(vo));
	}
}