package com.project.HelloWorld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.HelloWorld.Entity.Lproducts;
import com.project.HelloWorld.Entity.productDTO;
import com.project.HelloWorld.Repository.productRepo;
//import com.project.schoolmns.entity.Student;

@RestController
@RequestMapping("/products")
public class productController {
	
	@Autowired
	productRepo repository;
	@GetMapping({"","/"})
	public String listofProducts(Model model) {
		List<Lproducts> products=repository.findAll();
		model.addAttribute("products",products); 
		
		return "products";
	}
	
	@GetMapping("/products/new")
	public String createProducts(Model model) {
		productDTO productdto=new productDTO();
		model.addAttribute("productdto",productdto);
		return "products/CreateProduct";
	}
}
