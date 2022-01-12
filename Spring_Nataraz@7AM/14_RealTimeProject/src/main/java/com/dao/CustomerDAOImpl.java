package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.bo.CustomerBO;
import com.dto.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {
	//private static final String ORACLE_CUSTOMER_INSERT_QUERY="INSERT INTO customer VALUES(custNo.NEXTVAL,?,?,?,?)";

	private static final String MYSQL_CUSTOMER_INSERT_QUERY="INSERT INTO customer(cname,cadd,pamount,intamount) VALUES(?,?,?,?)";
	DataSource ds;
	CustomerDAOImpl(DataSource ds){
		System.out.println("CustomerDAOImpl.CustomerDAOImpl()");
		this.ds=ds;
	}

	@Override
	public String insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;

		con = ds.getConnection();
		//ps=con.prepareStatement(ORACLE_CUSTOMER_INSERT_QUERY);
		ps=con.prepareStatement(MYSQL_CUSTOMER_INSERT_QUERY);
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getPamount());
		ps.setFloat(4, bo.getIntamount());

		count=ps.executeUpdate();

		ps.close();
		con.close();

		if(count==0)
			return "Fail";
		else
			return "Pass";
	}
}