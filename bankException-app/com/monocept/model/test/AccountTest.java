package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String args[])
	{
		caseStudy1();
		caseStudy2();
	}
	public static void caseStudy1()
	{
		Account acc1=new Account(101,"Abc",1000);
		acc1.withdraw(500);
		printDetails(acc1);
	}
	public static void caseStudy2()
	{	
		Account acc2=new Account(102,"abc",1000);
		try
		{
		 acc2.withdraw(600);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		printDetails(acc2);
	  }
	
	public static void printDetails(Account ac)
	{
		System.out.println("Account No:"+ac.getAccno());
		System.out.println("Name:"+ac.getName());
		System.out.println("Balance:"+ac.getBalance());
	}
}
