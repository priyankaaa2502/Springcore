package com.spring.value;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	public void displayStudent() {
		System.out.println("Name: " + name);
		System.out.println("InterestedCourse: " + interestedCourse);
		System.out.println("Hobby: " + hobby);
	}

}
