package com.monocept.model;

import java.util.Date;

public class Transaction {

	private int transectionId;
	private String dateTime;
	private double transectionAmount;

	private int genereteId() {
		int id = (int) (Math.random() * 5000) + 1000;
		return id;
	}

	public Transaction(double amount) {
		transectionId = genereteId();
		Date date = new Date();
		this.dateTime = date.toString();
		this.transectionAmount=amount;
	}

	@Override
	public String toString() {
		return "Transaction [transectionId=" + transectionId + ", dateTime=" + dateTime + ", transectionAmount="
				+ transectionAmount + "]";
	}

}
