package com.example.demo.bankApp.Service;

import java.util.List;

import com.example.demo.bankApp.Entity.Account;

public interface AccountService {
	//insert
	public Account createAccount(Account account);
	//find
	public Account getAccountDetailsByAccountNumber(long AccountNumber);
	//findAll
	public List<Account> getAllAccountDetails();
	//update or deposite
	public Account depositMoney(long accountNumber,double money);
	//update or withdraw
	public Account WithdrawAmount(long accountNumber,Double amount);
	//delete
	public void closeAccounr(long accountNumber);
}
