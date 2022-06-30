package com.monocept.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	int rollNo() default 0;

	String name() default "";

	String city() default "Delhi";

	double cgpa() default 0;

}