package com.project.schoolmns.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.schoolmns.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer>{

}
