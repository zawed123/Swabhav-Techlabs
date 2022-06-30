package com.monocept.model.test;

import java.lang.reflect.Method;

import com.monocept.model.A;
import com.monocept.model.B;
import com.monocept.model.NeedToRefactor;

public class AnnotationTest {

	public static void main(String args[]) {
		System.out.println("A class methods");
		findMethodsNeedToRefactor(A.class);

		System.out.println("B class methods");
		findMethodsNeedToRefactor(B.class);
	}

	public static void findMethodsNeedToRefactor(Class c) {
		int count = 0;
		Method m[] = c.getMethods();
		for (Method method : m) {
			if (method.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.println("Method: " + method.getName());
			}
		}
	}
}
