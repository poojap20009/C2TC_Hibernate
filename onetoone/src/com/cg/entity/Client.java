package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Student student = new Student();
		student.setId(100);
		student.setName("Pooja");
		
		Address address = new Address();
		address.setAddress_id(200);
		address.setStreet("XYZ");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setZipcode("560024");
		
		student.setAddress(address);
		
		manager.persist(student);
		
		manager.getTransaction().commit();
		
		System.out.println("One student and address details are added");
		
		manager.close();
		
		
	}

}
