package in.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.app.model.Student;
import in.app.utility.DBUtility;

public class IStudentDAOImpl implements IStudentDAO {

	//110, 'ganga', 'JAVA', 79354.92,900
	String insertQuery = "INSERT INTO STUDENT VALUES(?, ?, ?, ?,?)";
	String getStudent = "SELECT SID,SNAME,COURSE,FREE,DISCOUNT FROM STUDENT";

	PreparedStatement ps=null;
	int insertCount;
	@Override
	public int saveStudent(Student stud) {
		try {
			Connection con = DBUtility.getConnection();
			ps = con.prepareStatement(insertQuery);

			ps.setInt(1, stud.getSid());
			ps.setString(2, stud.getSname());
			ps.setString(3, stud.getCourse());
			ps.setDouble(4, stud.getFree());
			ps.setDouble(5, stud.getDiscount());

			insertCount = ps.executeUpdate();

			if(insertCount==1) {

				System.out.println("INSERTED");
			}else {

				System.out.println("FAILED");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertCount;
	}

	@Override
	public List<Student> getRecords() {
		List<Student> listStud=new ArrayList<Student>();
		try {
			Student stud = null;

			Connection con = DBUtility.getConnection();
			ps = con.prepareStatement(getStudent);
			ResultSet rs	= ps.executeQuery();
			while (rs.next()) {
				stud = new Student();
				stud.setSid(rs.getInt(1));
				stud.setSname(rs.getString(2));
				stud.setCourse(rs.getString(3));
				stud.setFree(rs.getDouble(4));
				stud.setDiscount(rs.getDouble(5));
				listStud.add(stud);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listStud;
	}
}
