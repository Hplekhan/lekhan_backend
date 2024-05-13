package com.excel.springcore.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address1")
	private Address address;
	
///*parametersied constructor*/
//	public Employee(Address address) {
//		this.address = address;
//	}
//	
//	/*Zero parameterized*/
//	public Employee() {
//		super();
//		
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	
	

}
