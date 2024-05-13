package com.excel.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/springcore/autowired/config.xml");
		
		Employee emp = context.getBean("employee", Employee.class);
		
		System.out.println(emp);
	}
}
