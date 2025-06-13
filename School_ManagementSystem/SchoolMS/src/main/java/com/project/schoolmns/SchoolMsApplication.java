package com.project.schoolmns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.schoolmns.entity.Student;
import com.project.schoolmns.repo.student_repo;

@SpringBootApplication
public class SchoolMsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolMsApplication.class, args);
	}
	@Autowired
	private student_repo StudentRepositary;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student s1= new Student("Absardeen","N","Absarm@gmail.com");
//		StudentRepositary.save(s1);
//		Student s2= new Student("Anasirudeen","N","Anasm@gmail.com");
//		StudentRepositary.save(s2);
//		Student s3= new Student("Ibrahim","N","Ibra@gmail.com");
//		StudentRepositary.save(s3);
	}

}
