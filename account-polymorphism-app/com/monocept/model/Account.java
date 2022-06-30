package com.monocept.model;

import java.util.*;

public abstract class Account {

	private int accno;
	private String name;
	protected double balance;
	private String accountType;
    List<Transaction> transaction=new ArrayList<>();
	public abstract void withdraw(double amt);

	public Account(int accno, String name, double balance, String accountType) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.accountType=accountType;
	}

	public void diposit(double amt) {
		balance += amt;
		Transaction t=new Transaction(amt);
		transaction.add(t);
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	public String getAccountType()
	{
	return accountType;
	}
	public List<Transaction> getTransecation()
	{
		return transaction;
	}
}
