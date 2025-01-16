package com.demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		
		EntityManagerFactory factory =	Persistence.createEntityManagerFactory("mohammed");
		EntityManager entity = factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		//inserting data into database table
		Employee emp = new Employee(123, "Mujeebuddin", 25000, "Hyd");
		
		// entity.persist(emp);
		
		Employee fetchemp =	entity.find(Employee.class, 123);
		System.out.println("Employee Id: " +fetchemp.getEmpid());
		System.out.println("\t Employee Id: " +fetchemp.getEmpname());
		System.out.println("\t Employee Id: " +fetchemp.getEmpsal());
		System.out.println("\t Employee Id: " +fetchemp.getEmpadd());
		
		//update
		fetchemp.setEmpadd("Pdpl");
		fetchemp.setEmpname("Najeeb");
		fetchemp.setEmpsal(80000);
		
	//	entity.merge(fetchemp);
		
		entity.remove(fetchemp);
		
		entity.getTransaction().commit();
	}
}
