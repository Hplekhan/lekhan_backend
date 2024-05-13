package com.excel.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.excel.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		return new Student();
	}
	
	@Bean
	public Kachori getKachori() {
		return new Kachori();
	}

}
