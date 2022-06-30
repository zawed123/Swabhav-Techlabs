package com.monocept.model.test;

import java.lang.reflect.Method;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String args[])
	{
	  try
	  {
		 Rectangle r=new Rectangle();
		 Class classObj=Rectangle.class;
		 Method [] methods=classObj.getMethods();
		 int count=0;
		 for(Method m:methods)
		 {
		   String ss=m.getName();
		   for(Method mm:methods)
		   {
			 if(ss.equals(mm.getName()))
			 {
			  count++;
			 }
		   }
		   System.out.println("Method Name:"+ss+" Total Methods:"+count);
		   count=0;
		 }
	  }
	  catch(Exception e)
	  {
		 System.out.println(e.getMessage());
	  }
	}
}
