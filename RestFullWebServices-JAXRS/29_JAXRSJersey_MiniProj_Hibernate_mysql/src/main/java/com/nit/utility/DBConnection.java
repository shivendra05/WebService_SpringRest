package com.nit.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DBConnection {

	public static SessionFactory session;

	static{
		try {
			session = new Configuration().configure().buildSessionFactory();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public static SessionFactory getSession() {
		return session;
	}
}
