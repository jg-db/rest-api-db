package io.javaguru.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javaguru.dao.OrderRepository;
import io.javaguru.models.Orders;

@Service
public class OrdersService {
	@Autowired
	private OrderRepository ordersRepository;
	
	public List<Orders> getAllOrders(){
		List<Orders> orders = new ArrayList<>();
		ordersRepository.findAll().forEach(orders::add);
		
		return orders;
	}	
	
	public Orders getOrder(Integer id) {
		return ordersRepository.findOne(id);
	}
	
	public void addOrder(Orders order) {
		ordersRepository.save(order);
	}
	
	public void updateOrder(Orders order) {
		ordersRepository.save(order);
	}
	
	public void deleteOrder(Integer id) {
		ordersRepository.delete(id);
	}
}
