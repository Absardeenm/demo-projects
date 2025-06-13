package com.project.schoolmns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.schoolmns.Entity.Student;
import com.project.schoolmns.repo.Studentrepo;

public class implClass implements StudentService {
	@Autowired
	Studentrepo repo;

	@Override
	public Student createStudent(Student stude) {
		// TODO Auto-generated method stub
		Student student_Save=repo.save(stude);
		return student_Save;
	}

	@Override
	public List<Student> getAllStudents1() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	 
}
