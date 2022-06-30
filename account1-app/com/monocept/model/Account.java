package com.monocept.model;
import java.io.Serializable;

public class Account implements Serializable {
	private  transient String name;
	private int accno;
	private float balance;
	private static final int minBalance = 500;
	
	public Account(int accno,String name)
	{
		this(accno,name,minBalance);
	}
	public Account(int accno, String name, float balance) {
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}
	public void diposit(float amt) {
		balance += amt;
	}

	public void withdrwal(float amt) {
		if ((balance - amt) >= minBalance)

			balance = balance - amt;
	}

	public String getName() {
		return name;
	}

	public int getAccno() {
		return accno;
	}

	public float getBalance() {
		return balance;
	}
}