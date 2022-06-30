package com.monocept.model;

public class Rectangle {

	 private int width;
	 private int height;
	 public Rectangle()
	 {
	   System.out.println("Ractangle class");
	 }
	 public Rectangle(int pwidth)
	 {
	  width=pwidth;
	 }
	 public void fun1()
	 {
	   System.out.println("fun1");
	 }

	 public void fun2()
	 {
	   System.out.println("fun2");
	 }

	 public void fun3()
	 {
	   System.out.println("fun3");
	 }

	 public void fun4()
	 {
	   System.out.println("fun4");
	 }
	public void setHeight(int phight)
	{
	 height=phight;
	}
	 public int getWidth()
	 {
	  return width;
	 }
	 public int getHeight()
	 {
	  return height;
	 }
}
