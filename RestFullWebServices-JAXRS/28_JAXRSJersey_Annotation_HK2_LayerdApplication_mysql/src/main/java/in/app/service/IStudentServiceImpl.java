package in.app.service;

import java.util.List;

import javax.inject.Inject;

import in.app.dao.IStudentDAO;
import in.app.model.Student;

public class IStudentServiceImpl implements IStudentService {

	@Inject
	private IStudentDAO dao;

	@Override
	public int saveStudentData(Student stud) {

		//calculate discount
		double getFee = stud.getFree();
		double discount = getFee+(getFee*10)/100;
		stud.setDiscount(discount);

		int status = dao.saveStudent(stud);
		return status;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> listStud = null;
		//calculate discount
		listStud = dao.getRecords();
		System.out.println(listStud);
		return listStud;
	}
}