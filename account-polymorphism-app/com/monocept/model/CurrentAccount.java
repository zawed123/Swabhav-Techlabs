package com.monocept.model;

public class CurrentAccount extends Account {

	private static final int minBalance = -10000;
	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance,"Current Account");
	}
	@Override
	public void withdraw(double amt) {
		if ((balance-amt)>=minBalance)
			balance = balance - amt;
		    Transaction t = new Transaction(amt);
		    transaction.add(t);
	}
}
