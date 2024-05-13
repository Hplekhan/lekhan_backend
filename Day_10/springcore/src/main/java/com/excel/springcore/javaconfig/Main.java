package com.excel.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student std = cxt.getBean("student", Student.class);
		
		std.study();
	}
}
