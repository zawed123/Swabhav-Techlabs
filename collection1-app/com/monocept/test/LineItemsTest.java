package com.monocept.test;

import java.util.*;
import java.util.HashSet;

import com.monocept.model.LineItems;

public class LineItemsTest {

	public static void main(String args[])
	{
		Set<LineItems> list=new HashSet<>();
		list.add(new LineItems(101,"Cinthol",2,45));
		list.add(new LineItems(201,"Deo",3,145));
		list.add(new LineItems(301,"Luxe",5,260));
		list.add(new LineItems(101,"Cinthol",4,50));
		list.add(new LineItems(201,"Deo",7,90));
		list.add(new LineItems(501,"Neem",4,80));
		
		
		for(Object obj:list)
		{
			LineItems ll=(LineItems) obj;
			System.out.println(ll.toString());
		}
	}
}
