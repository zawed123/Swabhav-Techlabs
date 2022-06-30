package com.monocept.model.test;

import com.monocept.model.Account;

public class CustomerDetails {

	public void printDetails(Account a) {
		System.out.println("Account No:" + a.getAccno());
		System.out.println("Name:" + a.getName());
		System.out.println("Balance:" + a.getBalance());
	}
}
