package com.gopi.HibernateProject1;

import com.gopi.HibernateProject1.entity.OrderData;
import com.gopi.HibernateProject1.repository.OrderRepository;

public class OrderApp {
	public static void main(String[] args) {
		
		OrderData data = new OrderData("Chicken Dum Biryani",5, "food");
		OrderRepository repository = new OrderRepository();
		System.out.println(repository.saveOrder(data));
//		System.out.println(repository.updateOrder(data));
//		System.out.println(repository.getOrderById(3));
//		System.out.println(repository.getAllOrders());
	}
}
