package com.monocept.model.test;

import com.monocept.model.Account;

public class CustomerDetails {
	public void printDetails(Account acc[]) 
	{
		for(Account a:acc)
		{
		 printDetails(a);
		}
	}
	public void printDetails(Account acc)
	{
		System.out.println("Account No:" + acc.getAccno());
		System.out.println("Name:" + acc.getName());
		System.out.println("Balance:" + acc.getBalance());	
	}
}
