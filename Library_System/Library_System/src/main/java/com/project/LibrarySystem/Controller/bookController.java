package com.project.LibrarySystem.Controller;

import java.util.List;

//import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.LibrarySystem.Service.BookService;
import com.project.LibrarySystem.Service.MyBookService;
import com.project.LibrarySystem.Entity.Book;
import com.project.LibrarySystem.Entity.MyBookList;
//import com.project.LibrarySystem.models.Book;

@Controller

public class bookController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private MyBookService mybookservice;
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	 @GetMapping("/book_register")
	 public String BookRegiste() {
		 return "bookRegister";
	 }
	 
	 @GetMapping("/available_books")
	 public ModelAndView getAll() {
		 List<Book> book=service.getAll();
//		 ModelAndView m=new ModelAndView();
//		 m.setViewName("bookList");
		 return new ModelAndView("bookList","book",book);
		 
		 }
	 
	@PostMapping("/save")
	public String addbook(@ModelAttribute Book b) {
		service.save(b);
		return "redirect:/available_books";
		
	}
	
	@GetMapping("/mybooks")
	public String getBooks(Model model){
		List<MyBookList>list=mybookservice.getAllMyBooks();
		model.addAttribute("book", list);
		return "myBooks";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getmyList(@PathVariable("id") int id) {
		Book b=service.getBookById(id);
		MyBookList mb=new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		mybookservice.saveMyBooks(mb);
		return "redirect:/mybooks";
		
	}
	
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id,Model model) {
		Book b=service.getBookById(id);
		model.addAttribute("book", b);
		return "bookEdit";
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deletBook(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/available_books";
		
	}
	 }

