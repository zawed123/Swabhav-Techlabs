package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountWithdrawTest {

	public static void main(String args[])
	{
		 Details d=new Details();
		 Account a1=new Account(101,"Asha",1000);
		 a1.withdraw(100);
		 d.printDetails(a1);
		 
		 Account a2=new Account(102,"Rohan");
		 a2.withdraw(1000);
		 d.printDetails(a2);
	}
}
