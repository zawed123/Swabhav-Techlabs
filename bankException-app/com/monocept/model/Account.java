package com.monocept.model;

public class Account {

	private int accno;
	private String name;
	private double balance;
	private static final int minBalance=500;

	public Account(int accno, String name,double balance) {
	    this.accno=accno;
	    this.name=name;
	    this.balance=balance;
	}
	public void deposit(double amt) {
		balance = balance + amt;
	}
    public void withdraw(double amt)
    {
    	if ((balance - amt) >= minBalance)
    	
    		balance=balance-amt;
       else	
    	   
       throw new InsufficientFundsException(this);
    }
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccno() {
		return accno;
	}
}
