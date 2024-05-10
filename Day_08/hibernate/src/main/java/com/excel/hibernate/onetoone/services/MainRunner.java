//package com.excel.hibernate.onetoone.services;
//
//import com.excel.hibernate.onetoone.entity.MarksCard;
//import com.excel.hibernate.onetoone.entity.Student;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class MainRunner {
//	
//	private static EntityManagerFactory factory;
//	private static EntityManager manager;
//	private static EntityTransaction transaction;
//	
//	
//	public static void main(String[] args) {
//		
//		 factory = Persistence.createEntityManagerFactory("student");
//		 manager = factory.createEntityManager();
//		 transaction = manager.getTransaction();
//		 
//		 Student st = new Student();
//		 st.setName("kavya");
//		 st.setAge(90);
//		 
//		 
//		 MarksCard mc = new MarksCard();
//		 mc.setGrade("A");
//		 mc.setMarks(98.0);
//		 mc.setStudent(st);
//		 
//		 
//		 transaction.begin();
//		 manager.persist(st);
//		transaction.commit();	
//		
//		manager.close();
//	}
//
//}
