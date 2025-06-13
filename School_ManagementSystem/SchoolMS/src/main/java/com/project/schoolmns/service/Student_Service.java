package com.project.schoolmns.service;

import java.util.List;

import com.project.schoolmns.entity.Student;

public interface Student_Service   {
	
	List<Student> getAllStudents();

	Student save(Student student);

	Student getStudentById(Long id);
	Student updateStudent(Student studen);
	
	 void deleteStudentById(Long id);
}
