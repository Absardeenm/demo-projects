package com.project.LibrarySystem.Repository;

//import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.LibrarySystem.Entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	

}
