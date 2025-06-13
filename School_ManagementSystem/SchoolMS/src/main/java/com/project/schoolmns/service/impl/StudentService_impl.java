package com.project.schoolmns.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.schoolmns.entity.Student;
import com.project.schoolmns.repo.student_repo;
import com.project.schoolmns.service.Student_Service;
@Service
public class StudentService_impl implements Student_Service {

	private student_repo studentRepositary;
	
	
	public StudentService_impl(student_repo studentRepositary) {
		super();
		this.studentRepositary = studentRepositary;
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepositary.findAll();
	}


	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepositary.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepositary.findById(id).get();
	}


	@Override
	public Student updateStudent(Student studen) {
		// TODO Auto-generated method stub
		return studentRepositary.save(studen);
		}


	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		 studentRepositary.deleteById(id);
	}

	



	

}
