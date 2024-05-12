package com.excel.petadoption.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.excel.petadoption.entity.EventAttendence;
import com.excel.petadoption.entity.EventTable;
import com.excel.petadoption.entity.MessageTable;
import com.excel.petadoption.entity.Pets;

import antlr.debug.Event;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {

		factory = Persistence.createEntityManagerFactory("message_table");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		
		/* Organization org = new Organization();*/
		
		/*Users us = new Users();*/
		
		/*AdoptionApplication adoptApp = new AdoptionApplication();*/

		/*EventTable event = new EventTable();*/
		
		/*Pets pets = new Pets();*/
		
		/*EventAttendence attendence = new EventAttendence();*/
		
		MessageTable msgTable = new MessageTable();
		
		transaction.begin();
		manager.persist(msgTable);
		transaction.commit();

		manager.close();

	}

}
