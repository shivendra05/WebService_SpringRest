package in.app.service;

import java.util.List;

import in.app.model.Student;

public interface IStudentService {

	public int saveStudentData(Student stud);
	public List<Student> getStudents();
}
