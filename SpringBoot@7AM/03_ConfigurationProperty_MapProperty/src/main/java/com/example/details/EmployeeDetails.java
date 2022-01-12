package com.example.details;

import java.util.Map;
import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("emp")
public class EmployeeDetails implements CommandLineRunner {

	private Map<String, Integer> subMarks;
	private Map<String, String> usrAddr;
	private Properties usrProp;
	
	public Properties getUsrProp() {
		return usrProp;
	}

	public void setUsrProp(Properties usrProp) {
		this.usrProp = usrProp;
	}

	public Map<String, String> getUsrAddr() {
		return usrAddr;
	}

	public void setUsrAddr(Map<String, String> usrAddr) {
		this.usrAddr = usrAddr;
	}

	public Map<String, Integer> getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(Map<String, Integer> subMarks) {
		this.subMarks = subMarks;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [subMarks=" + subMarks + ", usrAddr=" + usrAddr + ", usrProp=" + usrProp + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Employee");
		System.out.println(this);
	}
}