package com.monocept.basics;

public class CmdLineArgsTest {
 public static void main(String args[])
{
  int sum=0;
  int max=Integer.parseInt(args[0]);
  int min=max;
  for(String n:args)
  {
   int x=Integer.parseInt(n);
   sum=sum+x;
   if(max<x)
    {
       max=x;
    }
   else if(min>x)
    {
      min=x;
    }
  }
   System.out.println("Sum is:"+sum);
   System.out.println("Average is:"+(double)sum/args.length);
   System.out.println("The Max value is:"+max);
   System.out.println("The Min value is:"+min);
 }
}