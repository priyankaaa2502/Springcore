package com.spring.commonannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College collegeObj = context.getBean("college",College.class);
		System.out.println("College Object is Created.."+collegeObj.toString());
		collegeObj.test();
	}
}
