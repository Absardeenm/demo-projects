package com.project.schoolmns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.schoolmns.Entity.Student;
import com.project.schoolmns.service.StudentService;
//import com.project.schoolmns.service.Studentservice;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080") 
public class StudentConroller {
	
	StudentService sv;
	
//	@GetMapping	
//    public String showForm() {
//        return "registration"; // This should match your HTML file name
//    }
	@PostMapping("/students")
	public ResponseEntity<Student> registerUser(@RequestBody Student stud) {
		Student studentcreate=sv.createStudent(stud);
		return ResponseEntity.status(HttpStatus.CREATED).body(studentcreate);

	}
	
	  @GetMapping("/register")
	    public ResponseEntity<List<Student>> getAllStudents() {
	        List<Student> students = sv.getAllStudents1();
	        return ResponseEntity.ok(students);
	    }
}
