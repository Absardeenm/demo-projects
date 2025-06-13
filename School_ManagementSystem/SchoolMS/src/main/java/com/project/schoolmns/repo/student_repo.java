package com.project.schoolmns.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.schoolmns.entity.Student;
@Repository
public interface student_repo extends JpaRepository<Student, Long> {
	

}
