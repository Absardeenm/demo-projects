package com.project.LibrarySystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.LibrarySystem.Entity.MyBookList;
import com.project.LibrarySystem.Service.MyBookService;

@Controller
public class MyBookListController {

	@Autowired
	private MyBookService service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		service.deleteByid(id);
		return "redirect:/mybooks";
	}
}
