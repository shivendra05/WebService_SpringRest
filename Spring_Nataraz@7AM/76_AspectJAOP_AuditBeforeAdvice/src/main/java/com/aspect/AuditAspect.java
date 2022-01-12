package com.aspect;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.JoinPoint;

public class AuditAspect {

	public void audit(JoinPoint jp) throws IOException {
System.out.println("AuditAspect.audit()");
		Object[] obj=	jp.getArgs();
		FileWriter writer = new FileWriter("F:\\Spring_Nataraz@7AM\\auditFile.txt");

		writer.write(obj[0]+" test have taken under monitering of "+obj[2]);
		writer.flush();
		writer.close();
	}
}