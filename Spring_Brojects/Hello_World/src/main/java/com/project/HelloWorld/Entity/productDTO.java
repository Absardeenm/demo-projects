package com.project.HelloWorld.Entity;

import org.hibernate.annotations.NotFound;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class productDTO {
	 @NotEmpty(message="The name is required")
	private String name;
	 
	 @NotEmpty(message="The brand is required")
	 private String brand;
	 
	 @NotEmpty(message="The name is required")
	 private String category;
	 
	 @Min(0)
	 private double price;
	 
	 @Size(min=10, message="the message should be contains 10 charectors")
	 @Size(max=2000, message="the message should not be contains more than 20000 charectors")
	 private String descripson;
	 
	 private MultipartFile imageFiles;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescripson() {
		return descripson;
	}

	public void setDescripson(String descripson) {
		this.descripson = descripson;
	}

	public MultipartFile getImageFiles() {
		return imageFiles;
	}

	public void setImageFiles(MultipartFile imageFiles) {
		this.imageFiles = imageFiles;
	}
	 
	 
	 
}
