 package com.example.demo.bankApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bankApp.Entity.Account;
import com.example.demo.bankApp.repo.AccountRepositary;
@Service
public class AccountServiceImplementaion implements AccountService {

	@Autowired
	AccountRepositary repo;
	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		Account account_save=repo.save(account);
		return account_save;
	}

	@Override
	public Account getAccountDetailsByAccountNumber(long AccountNumber) {
		// TODO Auto-generated method sbtub
		Optional<Account> account=repo.findById(AccountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account is not present");
		}
		Account account_found=account.get();
		return account_found;
	}

	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account depositMoney(long accountNumber, double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account WithdrawAmount(long accountNumber, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAccounr(long accountNumber) {
		// TODO Auto-generated method stub
		
	}

}
