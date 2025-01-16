package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	
	public static void main(String[] args) {
	EntityManagerFactory factory =	Persistence.createEntityManagerFactory("mohammed");
	EntityManager entity = factory.createEntityManager();
	
	entity.getTransaction().begin();
	
	Address add = new Address();
	add.setHno(123);
	add.setColony("Mudami");
	add.setState("Telangana");
	add.setCity("Pdpl");
	add.setZipcode(505172);
	
	Employee emp = new Employee();
	emp.setEmpid(100);
	emp.setEmpname("Mujeeb");
	emp.setEmpsal(80000);
	emp.setAddress(add);
	
	
	// entity.persist(add); //optional
	entity.persist(emp);
	
	
	//fetching data
	Employee fetchdata = entity.find(Employee.class, emp.getEmpid());
	System.out.println("Employee ID:" +fetchdata.getEmpid());
	System.out.println("Employee Name:" +fetchdata.getEmpname());
	System.out.println("Employee Salary:" +fetchdata.getEmpsal());
	System.out.println("Employee Colony:" +fetchdata.getAddress().getColony());
	System.out.println("Employee State:" +fetchdata.getAddress().getState());
	
	
	//update
	
	Address fetchadd = entity.find(Address.class, add.getHno());
	fetchadd.setHno(256);
	fetchadd.setCity("KNR");
	fetchdata.setEmpname("Najeeb");
	fetchdata.setEmpsal(25000);
	
	// entity.merge(fetchdata);
	entity.remove(fetchdata);
	
	entity.getTransaction().commit();
	}
}
