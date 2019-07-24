package io.javaguru.models;

public class OrdersX {
	private Integer id;
	private String orderName;
	private String description;
	
	public OrdersX() {
		
	}

	public OrdersX(Integer id, String orderName, String description) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
