package com.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside after property set method--> Init");
		
	}
	
	public void sample() {
		System.out.println("My coding starts from here...");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method --->Destroy");
		// TODO Auto-generated method stub
		
	}

	
	/*
		public void init() {
		System.out.println("Init method of hello class is called...");
	}
	
	public void destroy() throws SQLException {
		System.out.println("Calling custom destroy method of Hello..");
	}
	*/
	
}
