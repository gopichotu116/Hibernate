package com.gopi.HibernateProject1.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
// SingleTon class
public class EntityManagerFactoryUtil {
	private static EntityManagerFactory factory;
	
	private EntityManagerFactoryUtil() {
		
	}
	public static EntityManagerFactory getFactory() {
		if(factory==null) {
			factory=Persistence.createEntityManagerFactory("gopi");
		}
		return factory;
	}
}
