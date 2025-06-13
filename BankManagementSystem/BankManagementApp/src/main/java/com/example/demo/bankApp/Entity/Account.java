package com.example.demo.bankApp.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Account Details")
@Data
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Acc_No")
	private long account_number;
	@Column(name = "User_Name")
	private String account_holder_name;
	@Column(name = "Acc_Balance")
	private double account_balance;
	
	
	public long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}

	public String getAccount_holder_name() {
		return account_holder_name;
	}

	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}

	public Account() {
		super();
	}

	public Account(String account_holder_name, double account_balance) {
		super();
		this.account_holder_name = account_holder_name;
		this.account_balance = account_balance;
	}

	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", account_holder_name=" + account_holder_name
				+ ", account_balance=" + account_balance + "]";
	}

	
}
