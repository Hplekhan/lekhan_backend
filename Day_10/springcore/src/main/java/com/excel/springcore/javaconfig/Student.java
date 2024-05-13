package com.excel.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	private Kachori kachori;

	@Override
	public String toString() {
		return "Student [kachori=" + kachori + "]";
	}

	public Kachori getKachori() {
		return kachori;
	}

	public void setKachori(Kachori kachori) {
		this.kachori = kachori;
	}
	
	public void study() {
		this.kachori.displayPrice();
		System.out.println("student is thinking.....");
	}
	
	
	
}
