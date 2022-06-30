package com.monocept.model;

public class Circle {

	private float radius;
	private BorderOption border;
	
	public Circle(float pradius)
	{
	 radius=pradius;
	}
	public Circle(float pradius,BorderOption pborder)
	{
	 radius=pradius;
	 border=pborder;
	}
	public float getRedius()
	{
	 return radius;
	}
	public float calculetArea()
	{
	 float area=(float)Math.PI*radius*radius;
	 return area;
	}
}
