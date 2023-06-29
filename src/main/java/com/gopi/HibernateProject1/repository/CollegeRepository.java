package com.gopi.HibernateProject1.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.gopi.HibernateProject1.entity.College;
import com.gopi.HibernateProject1.entity.Customer;
import com.gopi.HibernateProject1.util.EntityManagerFactoryUtil;

public class CollegeRepository {
	private EntityManager manager=EntityManagerFactoryUtil.getFactory()
			.createEntityManager();
	
	public void saveCollege(College college) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(college);
		transaction.commit();
	}
	
	public College getCollegeById(int id) {
		return manager.find(College.class, id);
	}
}
