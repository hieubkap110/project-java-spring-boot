package com.shopping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 50, nullable = false)
	private String id;

	@Column(name = "ORDER_ID", nullable = false)
	private Order order;

	@Column
	private Product product;

	@Column(name = "Quanity", nullable = false)
	private int quanity;

	@Column(name = "Price", nullable = false)
	private double price;

	@Column(name = "Amount", nullable = false)
	private double amount;

	public OrderDetail() {
		super();
	}

	public OrderDetail(String id, Order order, Product product, int quanity, double price, double amount) {
		super();
		this.id = id;
		this.order = order;
		this.product = product;
		this.quanity = quanity;
		this.price = price;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
