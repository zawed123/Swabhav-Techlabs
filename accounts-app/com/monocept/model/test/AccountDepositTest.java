package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountDepositTest {

	public static void main(String args[])
	{
	 Details d=new Details();
	 Account acc1=new Account(101,"Asha",500);
	 acc1.deposit(1000);
	 d.printDetails(acc1);
	 
	 Account acc2=new Account(102,"Rohan");
	 acc2.deposit(1000);
	 d.printDetails(acc2);
	
	 
	}
}
