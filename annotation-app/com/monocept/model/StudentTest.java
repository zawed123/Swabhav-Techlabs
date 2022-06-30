package com.monocept.model;

import java.lang.reflect.Method;

public class StudentTest {

	public static void main(String args[]) {
		Student s1 = new Student();
		Class c = s1.getClass();

		MyAnno an = (MyAnno) c.getAnnotation(MyAnno.class);

		System.out.println("RollNo:" + an.rollNo());
		System.out.println("Name:" + an.name());
		System.out.println("City:" + an.city());
		System.out.println("Gpa:" + an.cgpa());
		
		Method[]mm=an.getClass().getMethods();
		for(Method m:mm)
		{
			String m1=m.getName();
			System.out.println(m1);
		}
	}
}
