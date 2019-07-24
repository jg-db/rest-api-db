package io.javaguru.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

@Entity
@Table(name="LINES")
public class Lines {
	@Id
	private Integer Id;
	@Column(name="LINE_NUMBER")
	private Integer lineNumber;
	private String item;
	@Column(name="UNIT_PRICE")
	private Float unitPrice;
	private Integer quantity;
	private String status;
	private String uom;
	
	@ManyToOne
	private Orders order;
	
	public Lines() {
		
	}

	public Lines(Integer id, Integer lineNumber, String item, Float unitPrice, Integer quantity, String status,
			String uom, Integer orderId) {
		super();
		Id = id;
		this.lineNumber = lineNumber;
		this.item = item;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.status = status;
		this.uom = uom;
		this.order = new Orders(orderId, "","",null,"",null,"",null);
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	
}
