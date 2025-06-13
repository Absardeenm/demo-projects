package com.project.schoolmns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.project.schoolmns.entity.Student;
import com.project.schoolmns.service.Student_Service;

@Controller
public class Student_Controller {
	@Autowired
	private Student_Service Studentservice;

	public Student_Controller(Student_Service studentservice) {
		super();
		Studentservice = studentservice;
	}

	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students",Studentservice.getAllStudents() );
		return "students";
	}
	@GetMapping("/students/new")
	public String crteateStudentForm(Model model) {
		// create a object for holding student form data
		Student  student=new Student();
		model.addAttribute("student",student);
		return "Create_Student";
		
	}
	@PostMapping("/students")
	
	public String saveStudent(@ModelAttribute("students")Student student) {
		Studentservice.save(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editstudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student",Studentservice.getStudentById(id));
		return"edit_student";
		
	}
	
	@PostMapping("/students/{id}")
	public String updatestudentform(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
	
		// this is used for retreiving data from the data base 
	Student existing=Studentservice.getStudentById(id);
	existing.setId(id);
	existing.setFirstName(student.getFirstName());
	existing.setLastName(student.getLastName());
	existing.setEmail(student.getEmail());
	// this is used for save the update details of the Student
	Studentservice.updateStudent(existing);
	return "redirect:/students";
	
	}
	// to handle the delete operation 
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		Studentservice.deleteStudentById(id);
		return "redirect:/students";
	}
	
		
	}

