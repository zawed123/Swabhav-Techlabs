package com.monocept.basics;

public class OverLoadingTest
{
   public static void printinfo(String value)
   {
	System.out.println(value); 
   }
   public static void printinfo(int value)
   {
	  System.out.println(value);
   }
   public static void printinfo(double value)
   {
	  System.out.println(value);
   }
   public static void printinfo(float value)
   {
	  System.out.println("float="+value);
   }
   public static void printinfo(boolean value)
   {
	  System.out.println(value);
   }
   public static void printinfo(char value)
   {
	  System.out.println(value);
   }

   public static void main(String args[])
   {
	  OverLoadingTest.printinfo("Hello");
	  OverLoadingTest.printinfo(100);
	  OverLoadingTest.printinfo(100.55);
	  OverLoadingTest.printinfo(100.55f);
	  OverLoadingTest.printinfo(1==0);
	  OverLoadingTest.printinfo('#');
   }
}
