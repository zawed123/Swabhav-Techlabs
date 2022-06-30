package com.monocept.model.test;

import com.monocept.model.BorderOption;
import com.monocept.model.Circle;

public class CircleTest {

	public static void main(String args[])
	{
      PrintCircleDetails pd=new PrintCircleDetails();
      
	  Circle c1=new Circle(5.5f);
	  pd.PrintDetails(c1);
	  
	  Circle c2=new Circle(7.5f);
	  pd.PrintDetails(c2);
	  
	  Circle cArr[]=new Circle[] {c1,c2};
	  
	  
	}
}
