package com.project.HelloWorld.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HelloWorld.Entity.Lproducts;

public interface productRepo extends JpaRepository<Lproducts, Integer> {

	
}
