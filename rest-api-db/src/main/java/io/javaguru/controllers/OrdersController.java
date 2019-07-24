package io.javaguru.controllers;

import java.util.List;
import io.javaguru.services.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javaguru.models.Orders;

@RestController
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping ("/orders")
	public List<Orders> getAllOrders() {
		return ordersService.getAllOrders();
	}
	
	@RequestMapping("/orders/{id}")
	public Orders getOrder(@PathVariable Integer id) {
		return ordersService.getOrder(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/orders")
	public void addOrder(@RequestBody Orders order) {
		ordersService.addOrder(order);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/orders/{id}")
	public void updateOrder(@RequestBody Orders order) {
		ordersService.updateOrder(order);
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/orders/{id}")
	public void deleteOrder(@PathVariable Integer id) {
		ordersService.deleteOrder(id);
	}	
	
}
