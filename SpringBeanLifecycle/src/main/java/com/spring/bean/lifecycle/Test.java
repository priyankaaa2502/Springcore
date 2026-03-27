package com.spring.bean.lifecycle;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		StudentDAO bean = context.getBean("studentDAO",StudentDAO.class);
//		System.out.println("Student DAO object is created.. "+bean);
//		System.out.println("Retriveing all the data....");
//		bean.selectAllRows();;
		Hello hello = context.getBean("hello",Hello.class);
		hello.sample();
		context.registerShutdownHook();

	}
}
