package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bo.StudentBO;

//@Repository("dao")
public class StudentDAOImpl3 implements StudentDAO {

	private static final String GET_STUDENTS="select SNAME,DOORNO,STATE,PINCODE from student where ROLLNUMBER=?";
	private static final String GET_All_STUDENTS="select * from student where state in (?,?,?)";

	@Autowired
	JdbcTemplate jt;

	@Override
	public StudentBO getAllStudent(int sid) throws Exception {
		StudentBO getBo=null;
		getBo = jt.queryForObject(GET_STUDENTS, (rs, rowNum)->{
			StudentBO bo=null;
			bo= new StudentBO();
			bo.setSname(rs.getString(1));
			bo.setDoorno(rs.getString(2));
			bo.setState(rs.getString(3));
			bo.setPincode(rs.getInt(4));
			return bo;
		}, sid);
		return getBo;
	}

	@Override
	public List<StudentBO> getStudentByCity(String city1, String city2, String city3) throws Exception {
		List<StudentBO> listBO=null;
		listBO =new ArrayList<StudentBO>();
		listBO = jt.query(GET_All_STUDENTS, 
				(rs) -> {
					List<StudentBO> lbo=null;
					StudentBO bo=null;
					lbo =  new ArrayList<>();
					while (rs.next()) {
						bo= new StudentBO();
						bo.setSid(rs.getInt(1));
						bo.setSname(rs.getString(2));
						bo.setDoorno(rs.getString(3));
						bo.setStreetname(rs.getString(4));
						bo.setAreanamel(rs.getString(5));
						bo.setState(rs.getString(6));
						bo.setCountry(rs.getString(7));
						bo.setPincode(rs.getInt(8));
						lbo.add(bo);
					}
					return lbo;
				}, city1, city2, city3);
		return listBO;
	}

	@Override
	public List<StudentBO> getStudentByCityUsingRowCallBack(String city1, String city2, String city3) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}