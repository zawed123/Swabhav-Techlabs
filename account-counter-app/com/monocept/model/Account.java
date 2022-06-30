package com.monocept.model;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private static int count;
	
	static {
		count=100;
		System.out.println("inside static block");
	}
	public Account(int accno,String name)
	{
	 this(accno,name,500);
	}
	public Account(int accno,String name,double balance)
	{
	  this.accno=accno;
	  this.name=name;
	  this.balance=balance;
	  System.out.println("inside constructor block");
	  count++;
	}
	public int getCount()
	{
	 return count;
	}
	public static int getheadCount()
	{
	 return count;
	}

}
