package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bo.EmployeeBO;

@Repository("dao")
public class EmployeeDAOImpl implements EmployeeDAO {

	private final static String getEmployeeDetails="SELECT ENO, ENAME, JOB_TITLE, SAL, DEPTNO FROM Employee_Department WHERE job_title IN (?,?)";

	@Autowired
	DataSource ds= null;
	/*EmployeeDAOImpl(DataSource ds){
		this.ds=ds;
	}*/

	@Override
	public List<EmployeeBO> getEmpByJob(String dept1,String dept2) throws Exception {
		System.out.println("Data base::"+ds.getClass());
		try {
			PreparedStatement ps = null;
			EmployeeBO listBO=null;
			Connection con=null;
			ResultSet rs= null;
			List<EmployeeBO> empbo=null;


			empbo= new ArrayList<EmployeeBO>();
			con= ds.getConnection();
			ps =con.prepareStatement(getEmployeeDetails);
			ps.setString(1, dept1);
			ps.setString(2, dept2);
			rs =ps.executeQuery();
			while (rs.next()) {
				listBO=new EmployeeBO();
				listBO.setEmpNo(rs.getInt(1));
				listBO.setEname(rs.getString(2));
				listBO.setJob(rs.getString(3)) ;
				listBO.setSal(rs.getFloat(4));
				listBO.setDeptNo(rs.getInt(5)) ;
				empbo.add(listBO);
			}
			return empbo;
		}catch (Exception e) {
			throw e;
		}
	}
}