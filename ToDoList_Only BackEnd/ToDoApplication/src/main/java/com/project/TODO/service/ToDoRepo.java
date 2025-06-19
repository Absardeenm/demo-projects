package com.project.TODO.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.TODO.Model.ToDo;
@Repository
public interface ToDoRepo extends JpaRepository<ToDo, Integer>{
	

}
