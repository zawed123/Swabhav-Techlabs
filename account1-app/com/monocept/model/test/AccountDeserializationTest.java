package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.monocept.model.Account;

public class AccountDeserializationTest {

	public static void main(String args[]) {
		CustomerDetails d = new CustomerDetails();
		Account acc;
		try {
			FileInputStream file = new FileInputStream("test.bin");
			ObjectInputStream in = new ObjectInputStream(file);

			acc = (Account) in.readObject();
			in.close();
			file.close();

			System.out.println("Object deserialized ");
			d.printDetails(acc);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
