package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	

	@Autowired
	public Human(Heart heart) {
		System.out.println("parametarised customer is called...");
		this.heart = heart;
	}


	public void setHeart(Heart heart) {
		System.out.println("setter method is called...");
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("You are dead..");
		}
	}
}
