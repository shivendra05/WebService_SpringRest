package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface IStudent {

	public String saveStudentDetails(Student stud);
	public Student getStudentByID(int id);
	public String deleteStudentByID(int id);
	public List<Student> getAllStudent();
	public String updateStudentDetails(Student stud);
	public boolean existStudent(int id);
}
