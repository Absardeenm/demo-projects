package com.project.LibrarySystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.LibrarySystem.Entity.MyBookList;
import com.project.LibrarySystem.Repository.MyBookRepository;
@Service

public class MyBookService {
	
	@Autowired
	private MyBookRepository mybook;
	public void saveMyBooks(MyBookList book) {
		
		mybook.save(book);
	}

	public List<MyBookList> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteByid(int id) {
		mybook.deleteById(id);
		
	}
	
}
