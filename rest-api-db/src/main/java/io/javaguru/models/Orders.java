package io.javaguru.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="ORDERS")
public class Orders {
	@Id
	private Integer id;
	@Column(name="ORDER_NUMBER")
	private String orderNumber;
	@Column (name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="SHIPMENT_DATE")
	private Date shipmentDate;
	private String status;
	@Column(name="TOTAL_AMOUNT")
	private Float totalAmount;
	private String currency;
	@Column(name="ORDERED_DATE")
	private Date orderedDate;

	public Orders() {
		
	}

	public Orders(Integer id, String orderNumber, String customerName, Date shipmentDate, String status, Float totalAmount, String currency,
			Date orderedDate) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.shipmentDate = shipmentDate;
		this.status = status;
		this.totalAmount = totalAmount;
		this.currency = currency;
		this.orderedDate = orderedDate;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
