package com.spring.commonannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages = "com.spring.commonannotations")
@PropertySource("classpath:college.properties")
public class CollegeConfig{

	@Bean
	public Principle principle() {
		return new Principle();
	}
	
	@Bean
	public College college(){//methodName will be bean id 
		
		College college = new College();
		college.setPrinciple(new Principle());
		return college;
	}
}
