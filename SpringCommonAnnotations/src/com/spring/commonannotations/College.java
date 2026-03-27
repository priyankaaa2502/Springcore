package com.spring.commonannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	@Value("${college.instituteName}")
	private String instituteName;
	
	private Principle principle;

	public void setPrinciple(Principle principle) {
		this.principle = principle;
		System.out.println("using setPrinciple method..");
	}

	/*
	 * public College(Principle principl) { this.principle = principle; }
	 */

	public void test() {
		principle.principleInfo();
		System.out.println("College.properies: "+instituteName);
		System.out.println("Test method is called...");
	}
}
