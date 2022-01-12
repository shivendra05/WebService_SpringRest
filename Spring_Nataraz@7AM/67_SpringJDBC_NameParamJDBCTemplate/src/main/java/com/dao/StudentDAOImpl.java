package com.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bo.StudentBO;

@Repository("dao")
public class StudentDAOImpl implements StudentDAO {

	private static final String GET_STUDENTS="select SNAME from student where ROLLNUMBER=:sno";
	private static final String GET_All_STUDENTS="select * from student where state in (?,?,?)";
	
	@Autowired
	NamedParameterJdbcTemplate npjt;

	@Override
	public String getAllStudent(int sid) throws Exception {
		Map map = new HashMap<>();
		String getName=null;
		map.put("sno", sid);
		getName = npjt.queryForObject(GET_STUDENTS, map, String.class);
		return getName;
	}

	private static class StudentData implements RowMapper<StudentBO>{
		@Override
		public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {

			StudentBO bo=null;
			bo= new StudentBO();
			bo.setSname(rs.getString(1));
			bo.setDoorno(rs.getString(2));
			bo.setState(rs.getString(3));
			bo.setPincode(rs.getInt(4));
			return bo;
		}
	}
	/*
		@Override
		public List<StudentBO> getStudentByCity(String city1, String city2, String city3) throws Exception {
			List<StudentBO> listBO=null;
			listBO = new ArrayList<StudentBO>() ;
	
			listBO = jt.query(GET_All_STUDENTS,new GetStudentDetialsByCityNames(), city1, city2, city3);
			return listBO;
		}
	
	
		static private class GetStudentDetialsByCityNames implements ResultSetExtractor<List<StudentBO>>{
			@Override
			public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				System.out.println("StudentDAOImpl.GetStudentDetialsByCityNames.extractData()");
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
			}
		}
	
		@Override
		public List<StudentBO> getStudentByCityUsingRowCallBack(String city1, String city2, String city3) throws Exception {
			List<StudentBO> listBO= new ArrayList<StudentBO>() ;
	
			jt.query(GET_All_STUDENTS,new GetStudentDetialsByCityNamesUsingRowCall(listBO), city1, city2, city3);
	
			return listBO;
		}
	
	
		static private class GetStudentDetialsByCityNamesUsingRowCall implements RowCallbackHandler{
	
			List<StudentBO> listBO =null;
	
			public GetStudentDetialsByCityNamesUsingRowCall(List<StudentBO> listBO) {
				this.listBO=listBO;
			}
	
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				System.out.println("StudentDAOImpl.GetStudentDetialsByCityNamesUsingRowCall.processRow()");
				StudentBO bo=null;
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
					listBO.add(bo);
				}
			}
		}
	*/
}