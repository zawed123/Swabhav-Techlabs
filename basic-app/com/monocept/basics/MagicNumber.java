package com.monocept.basics;

public class MagicNumber {

	public static boolean isMagic(int n)
	{
	 int sum=0;
	 while(n>0 || sum>9)
	 {
		if(n==0)
		{
		  n=sum;
		  sum=0;
		}
		sum=sum+(n%10);
		n=n/10;
	 }
	 return (sum==1);
	}
	public static void main(String args[])
	{
	  int n=1234;
	  if(isMagic(n)==true)
	  {
		 System.out.println("Magic Number");
	  }
	  else
	  {
		 System.out.println("Not Magic Number");
	  }
	}
}
