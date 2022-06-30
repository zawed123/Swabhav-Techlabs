package com.exception.test;

public class BugTest {

	public static void main(String args[])
	{
		int firstNo=Integer.parseInt(args[0]);
		int secondNo=Integer.parseInt(args[1]);
		
		int result=firstNo/secondNo;
		
		System.out.println("Result is:"+result);
		System.out.println("End of Program");
		
		main(args);
	}
}
