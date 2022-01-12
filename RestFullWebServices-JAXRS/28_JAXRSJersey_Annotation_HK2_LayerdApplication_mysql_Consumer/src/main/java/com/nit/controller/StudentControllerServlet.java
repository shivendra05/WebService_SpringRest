package com.nit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.glassfish.jersey.servlet.async.AsyncContextDelegateProviderImpl;

import com.nit.consumer.StudentConsumer;

import in.app.model.Student;

@WebServlet("/student")
public class StudentControllerServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int sid =Integer.parseInt(req.getParameter("sid"));
		String sname = req.getParameter("sname");
		String course = req.getParameter("course");
		Double fee = Double.parseDouble(req.getParameter("fee")) ;

		System.out.println("Servlet:: "+sid+sname+course+fee);
		Student stud =  new Student(sid,sname,course,fee);

		String msg = StudentConsumer.saveStudent(stud);

		System.out.println(msg);
		req.setAttribute("message", msg);

		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");

		rd.forward(req, resp);
	}
}
