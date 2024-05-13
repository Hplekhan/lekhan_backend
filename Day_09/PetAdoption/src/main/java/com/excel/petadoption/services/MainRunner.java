package com.excel.petadoption.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.excel.petadoption.entity.Organization;
import com.excel.petadoption.entity.Pets;
import com.excel.petadoption.entity.Users;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {

		factory = Persistence.createEntityManagerFactory("adoption_application");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		
		Organization org = new Organization();
		
		Users us = new Users();
		
		/*AdoptionApplication adoptApp = new AdoptionApplication();*/

		/*EventTable event = new EventTable();*/
		
		Pets pets = new Pets();
		
		/*EventAttendence attendence = new EventAttendence();*/
		
		/*MessageTable msgTable = new MessageTable();*/
		
		transaction.begin();
		manager.persist(pets);
		transaction.commit();

		manager.close();

	}

}
