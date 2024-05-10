package com.excel.hibernate.onetomany.services;

import java.util.ArrayList;
import java.util.List;

import com.excel.hibernate.onetomany.Laptop;
import com.excel.hibernate.onetomany.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;


	public static void main(String[] args) {


		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		List<Laptop> laptops = new ArrayList<>();
		Laptop lap1 = new Laptop();
		Laptop lap2 = new Laptop();
		Laptop lap3 = new Laptop();

		Student std = new Student();

		lap1.setBrand("Dell");
		lap1.setSerialNum("AXSPLDELL");
		lap1.setStudent(std);

		lap2.setBrand("Lenovo");
		lap2.setSerialNum("UXSPLENOVO");
		lap2.setStudent(std);

		lap3.setBrand("HP");
		lap3.setSerialNum("PQSTPTSHP");
		lap3.setStudent(std);

		std.setId(5);
		std.setName("Travis Scott");
		std.setAge(30);
		std.setLaptops(laptops);
		
		transaction.begin();
		manager.persist(std);
		transaction.commit();
//		System.out.println(manager.find(Student.class, 1));


	}
}
