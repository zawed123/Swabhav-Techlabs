package com.monocept.model;

import java.util.Objects;

public class LineItems {

	private int id;
	private String name;
	private int quantity;
	private double unitprice;
	
	public LineItems(int id, String name,int quantity,double unitPrice)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.unitprice=unitPrice;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public double getUnitPrice()
	{
		return unitprice;
	}
	public double calculetCost()
	{
		return quantity*unitprice;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(name,id);
	}
	@Override
	public boolean equals(Object obj)
	{
		LineItems li=(LineItems) obj;
		return Objects.equals(name,li.name) && Objects.equals(id,li.id);
	}
	@Override
	public String toString()
	{
	  return "ID:"+getId()+" Name:"+getName()+" Quantity:"+getQuantity()+" UnitPrice:"+getUnitPrice()+" Cost:"+
			  calculetCost();
	}
}
