package com.gopi.HibernateProject1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.gopi.HibernateProject1.entity.OrderData;
import com.gopi.HibernateProject1.entity.Person;

public class PersonRepository {
	
	private EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("gopi").createEntityManager();
	}
	
	public String savePerson(Person person) {
		
//		EntityManagerFactory factory =Persistence.createEntityManagerFactory("Harish");
//	    EntityManager manager= factory.createEntityManager();

		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
//		manager.persist(orderData);
		transaction.commit();
		return "Data is Saved";
	}
	
	public String updatePerson(Person person) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(person);
		transaction.commit();
		return "Data is updated";
	}
	
	public Person getPersonById(int id) {
		EntityManager manager = getEntityManager();
		return manager.find(Person.class, id);
	}
	
	public String deletePerson(int id) {
		EntityManager manager = getEntityManager();
		Person person = manager.find(Person.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if(person!=null) {
			transaction.begin();
			manager.remove(person);
			transaction.commit();
			return "Data is deleted";
		}
		else {
			return "No data is found to delete";
		}
	}
	
	public List getAllData() {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("From Person p");
		List list = query.getResultList();
		return list;
	}
	
	public List getPhoneNumByName(String name) {
		EntityManager manager = getEntityManager();
		String sql="SELECT p.phone_num FROM Person p WHERE p.name=?1";
		Query query = manager.createQuery(sql);
		query.setParameter(1, name);
		List list = query.getResultList();
		return list;
	}
	
	public List personDataByPersonNameAndAge(String name,int age) {
		EntityManager manager = getEntityManager();
		String sql="FROM Person p WHERE p.name=?1 AND p.age=?2";
		Query query = manager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, age);
		List list = query.getResultList();
		return list;
	}
}









