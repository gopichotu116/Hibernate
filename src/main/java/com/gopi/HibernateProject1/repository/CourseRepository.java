package com.gopi.HibernateProject1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.gopi.HibernateProject1.entity.Course;
import com.gopi.HibernateProject1.util.EntityManagerFactoryUtil;

public class CourseRepository {
	private EntityManager manager=EntityManagerFactoryUtil.getFactory()
			.createEntityManager();
	
	public void saveCourse(Course course) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(course);
		transaction.commit();
	}
	
	public void saveAllCourse(List<Course> courses) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		for(Course c:courses) {
			manager.persist(c);
		}
		transaction.commit();
	}
}












