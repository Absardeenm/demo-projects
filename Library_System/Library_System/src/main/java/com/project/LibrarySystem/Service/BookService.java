package com.project.LibrarySystem.Service;

import java.util.List;

//import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.LibrarySystem.Entity.Book;

import com.project.LibrarySystem.Repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository brepo;
	
	public void save(Book b) {
		
		brepo.save(b);
		
	}
	
	public List<Book> getAll(){
		return brepo.findAll();
	}
	
	 public Book getBookById(int id) {
		 return brepo.findById(id).get();
	 }
	 
	 public void deleteById(int id) {
		 brepo.deleteById(id); 
	 }
}
