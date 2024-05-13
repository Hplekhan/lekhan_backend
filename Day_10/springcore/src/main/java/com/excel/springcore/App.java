package com.excel.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new  ClassPathXmlApplicationContext("com/excel/springcore/config.xml");
    	
    	Student student = (Student) context.getBean("student");
    	
    	Student student1 = (Student) context.getBean("student1");
    	
    	System.out.println(student);
    	System.out.println(student1);
    	
    	
    	
    }

	
}
