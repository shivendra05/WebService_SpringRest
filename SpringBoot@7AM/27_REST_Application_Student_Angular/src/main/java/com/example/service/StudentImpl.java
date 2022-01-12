package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repositoty.StudentRepo;

@Service
public class StudentImpl implements IStudent {

	@Autowired
	StudentRepo repo;

	@Override
	public String saveStudentDetails(Student stud) {
		int studentID = repo.save(stud).getStudID();
		return "Data Saved with id::"+studentID;
	}

	@Override
	public Student getStudentByID(int id) {
		Student stud=null;
		Optional<Student> obj= repo.findById(id);
		if(obj!=null)
			stud = obj.get();
		return stud;
	}

	@Override
	public String deleteStudentByID(int id) {
		repo.deleteById(id);
		return "Student Deleted "+id;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> listStud = null;
		listStud = repo.findAll();
		return listStud;
	}
	
	@Override
	public String updateStudentDetails(Student stud) {
		repo.save(stud);
		return "Data is updated";
	}

	@Override
	public boolean existStudent(int id) {
		boolean status = repo.existsById(id);
		return status;
	}

}
