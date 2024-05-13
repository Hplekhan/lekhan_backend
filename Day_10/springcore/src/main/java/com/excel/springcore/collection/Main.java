package com.excel.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/springcore/collection/config.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println("Name :"+ employee.getName());
		
		System.out.println("Phone Numbers :"+ employee.getPhones());
		
		System.out.println("Skills :" + employee.getSkills());
		
		System.out.println("Nominee :" + employee.getNominees());
	
	}

}
