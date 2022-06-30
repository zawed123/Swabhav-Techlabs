package com.monocept.model;

public class Account {

	private int accno;
	private String name;
	private double balance;

	public Account(int accno, String name) {
		this(accno, name, 500);
	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public void withdraw(double amt) {
		if (balance <= amt) {
			System.out.println("Insufficent Balance");
		}
		balance = balance - amt;
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
