package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingAccount;

public class AccountTest {

	public static void main(String args[]) {
		CustomerDetails cd = new CustomerDetails();
		SavingAccount sa = new SavingAccount(101, "Rohan", 5000);
	    sa.diposit(1000);
	    cd.printDetails(sa);
		CurrentAccount ca = new CurrentAccount(102, "Asha", 1000);
		
		Account account[]=new Account[]{sa,ca};
		cd.printDetails(account);
	
	}
}
