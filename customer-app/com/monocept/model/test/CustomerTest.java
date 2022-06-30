package com.monocept.model.test;

import com.monocept.model.Customer;

public class CustomerTest {

	public static void main(String args[])
	{
	 Customer c1=new Customer("Rohan","Hydrabad",5000);
	 Customer c2=new Customer("Ramiya","Benglore",2000);
	 Customer c3=new Customer("Vineet","Mumbai",1000);
	 
	 PrintCustomer d=new PrintCustomer();
	 
	 d.printDetails(c1);
	 d.printDetails(c2);
	 d.printDetails(c3);
	 d.printDetails(c1);
	}
}
