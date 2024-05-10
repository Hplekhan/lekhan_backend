package com.excel.hibernate.manytomany.services;

import com.excel.hibernate.manytomany.Customer;
import com.excel.hibernate.manytomany.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {

		factory = Persistence.createEntityManagerFactory("customer");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		Customer c1 = new Customer();
		c1.setId(101);
		c1.setName("john");
		c1.setAddress("USA");

		Customer c2 = new Customer();
		c2.setId(102);
		c2.setName("Dani");
		c2.setAddress("Paris");

		Product p1 = new Product();
		p1.setId(1001);
		p1.setName("Washing Machine");
		p1.setPrice(20000);

		Product p2 = new Product();
		p2.setId(1002);
		p2.setName("AC");
		p2.setPrice(15000);

		c1.getProducts().add(p1);
		c1.getProducts().add(p2);

		c2.getProducts().add(p1);
		c2.getProducts().add(p2);

		p1.getCustomers().add(c1);
		p1.getCustomers().add(c2);

		p2.getCustomers().add(c1);
		p2.getCustomers().add(c2);

		transaction.begin();
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(p1);
		manager.persist(p2);
		transaction.commit();	

		manager.close();

	}

}
