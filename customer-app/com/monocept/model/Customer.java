package com.monocept.model;

public class Customer {
	private String id;
	private String name;
	private String address;
	private int orderAmt;
	private static int autoId = 1000;

	public Customer(String name, String address, int orderAmt) {
		this.name = name;
		this.address = address;
		this.orderAmt = orderAmt;
		id = "C" + (++autoId);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getaddress() {
		return address;
	}

	public int getOrderAmt() {
		return orderAmt;
	}
}
