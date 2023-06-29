package com.gopi.HibernateProject1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.gopi.HibernateProject1.entity.OrderData;

public class OrderRepository {
	
	private EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("gopi").createEntityManager();
	}
	
	public String saveOrder(OrderData order) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(order);
		transaction.commit();
		
		return "Order is saved";
	}
	
	public String updateOrder(OrderData order) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(order);
		transaction.commit();
		return "your Order is updated";
	}
	
	public OrderData getOrderById(int id) {
		EntityManager manager = getEntityManager();
		return manager.find(OrderData.class, id);
	}
	
	public String deleteOrder(int id) {
		EntityManager manager = getEntityManager();
		OrderData order = manager.find(OrderData.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if(order!=null) {
			transaction.begin();
			manager.remove(order);
			transaction.commit();
			return "your order is deleted";
		}
		else {
			return "No order is found to delete";
		}
	}
	
	public List getAllOrders() {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("FROM OrderData o");
		List list = query.getResultList();
		return list;
	}
}











