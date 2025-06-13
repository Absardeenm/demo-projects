package com.example.demo.bankApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bankApp.Entity.Account;

public interface AccountRepositary extends JpaRepository<Account, Long> {

}
