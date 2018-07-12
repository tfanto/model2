package com.fnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "item", indexes = { @Index(columnList = "id", name = "item00", unique = true),
		@Index(columnList = "itemnumber", name = "item10", unique = true), })
@NamedQueries({ @NamedQuery(name = Item.ITEM_GET_ALL, query = "SELECT i FROM Item i"), })

public class Item {

	public static final String ITEM_GET_ALL = "item.getall";

	public Item() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
	@SequenceGenerator(name = "item_generator", sequenceName = "item_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@NotEmpty
	@Size(max = 50)
	@Column(name = "itemnumber")
	private String itemnumber;

	@NotEmpty
	@Size(max = 50)
	@Column(name = "description")
	private String description;

	@Column(name = "ordering_point")
	@Min(value=1, message="ordering point must have a descent value")
	private Integer orderingPoint;

	@Column(name = "in_stock")
	private Integer inStock;

	@Column(name = "price")
	private Double price;

	@Column(name = "purchase_price")
	private Double purchasePrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemnumber() {
		return itemnumber;
	}

	public void setItemnumber(String itemnumber) {
		this.itemnumber = itemnumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOrderingPoint() {
		return orderingPoint;
	}

	public void setOrderingPoint(Integer orderingPoint) {
		this.orderingPoint = orderingPoint;
	}

	public Integer getInStock() {
		return inStock;
	}

	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inStock == null) ? 0 : inStock.hashCode());
		result = prime * result + ((itemnumber == null) ? 0 : itemnumber.hashCode());
		result = prime * result + ((orderingPoint == null) ? 0 : orderingPoint.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((purchasePrice == null) ? 0 : purchasePrice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inStock == null) {
			if (other.inStock != null)
				return false;
		} else if (!inStock.equals(other.inStock))
			return false;
		if (itemnumber == null) {
			if (other.itemnumber != null)
				return false;
		} else if (!itemnumber.equals(other.itemnumber))
			return false;
		if (orderingPoint == null) {
			if (other.orderingPoint != null)
				return false;
		} else if (!orderingPoint.equals(other.orderingPoint))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (purchasePrice == null) {
			if (other.purchasePrice != null)
				return false;
		} else if (!purchasePrice.equals(other.purchasePrice))
			return false;
		return true;
	}
	
	
	
	
	

}
