package com.project.LibrarySystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.LibrarySystem.Entity.MyBookList;
@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer>{
	

}
