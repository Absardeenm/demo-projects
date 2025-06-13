package com.example.demo.bankApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bankApp.Entity.Account;
import com.example.demo.bankApp.Service.AccountService;

@RestController
@RequestMapping("/Account")
public class AccountController {
	@Autowired
	AccountService service;
	//create a account
	@PostMapping("/create")
	public ResponseEntity<Account>  createAccount(@RequestBody Account account) {
		Account CreatedAccount=service.createAccount(account);
	return ResponseEntity.status(HttpStatus.CREATED).body(CreatedAccount);
	}
	
	@GetMapping("/{AccountNumber}")
	public Account getAccountByAccountNumber(@PathVariable Long AccountNumber) {
		Account account=service.getAccountDetailsByAccountNumber(AccountNumber);
		return account;
		
	}
}
