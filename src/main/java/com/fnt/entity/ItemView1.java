package com.fnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class ItemView1 {

	@Column(name = "id", updatable = false, nullable = false)
	@Id
	private Long id;

	@Column(name = "itemnumber")
	private String itemnumber;

	@Column(name = "description")
	private String description;

	@Column(name = "in_stock")
	private Integer inStock;

	@Column(name = "price")
	private Double price;

	public ItemView1() {

	}

	public ItemView1(String itemnumber, String description, Integer inStock, Double price) {
		this.itemnumber = itemnumber;
		this.description = description;
		this.inStock = inStock;
		this.price = price;
	}

}
