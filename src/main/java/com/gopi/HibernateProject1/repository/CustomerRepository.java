package com.gopi.HibernateProject1.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.gopi.HibernateProject1.entity.Customer;
import com.gopi.HibernateProject1.util.EntityManagerFactoryUtil;

public class CustomerRepository {
	private EntityManager manager=EntityManagerFactoryUtil.getFactory()
			.createEntityManager();
	
	public void saveCustormer(Customer customer) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
	}
	
	public Customer getCustomerById(int id) {
		return manager.find(Customer.class, id);
	}
}












