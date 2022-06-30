package com.monocept.model.test;

import com.monocept.model.Customer;

public class PrintCustomer {

	public void printDetails(Customer c)
	{
	  System.out.println("ID:"+c.getId());
	  System.out.println("Name:"+c.getName());
	  System.out.println("Address:"+c.getaddress());
	  System.out.println("OderAmount:"+c.getOrderAmt());
	}
}
