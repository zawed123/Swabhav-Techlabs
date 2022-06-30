package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Account;

public class AccountSerializationTest {

	public static void main(String args[]) {
		Account acc1 = new Account(123,"Abc", 5000);
		acc1.withdrwal(1000);

		CustomerDetails a = new CustomerDetails();
		a.printDetails(acc1);
		
		String filename = "test.bin";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(acc1);
			out.close();
			file.close();

			System.out.println("Object serialized");

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
