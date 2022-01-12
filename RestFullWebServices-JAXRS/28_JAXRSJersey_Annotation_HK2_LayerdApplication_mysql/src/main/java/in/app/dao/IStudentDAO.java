package in.app.dao;

import java.util.List;

import in.app.model.Student;

public interface IStudentDAO {

	public int saveStudent(Student stud);
	
	public List<Student> getRecords();
}
