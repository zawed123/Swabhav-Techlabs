package com.monocept.model.test;

import com.monocept.model.SavingAccount;

public class TransectionTest {

	public static void main(String args[])
	{
		SavingAccount sa = new SavingAccount(101, "Rohan", 5000);
	    sa.diposit(1000);
	    sa.withdraw(500);
	    System.out.println(sa.getTransecation());
	}
}
