package com.excel.springcore.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/excel/springcore/autowired/annotation/config.xml");

		Employee emp =	cxt.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
