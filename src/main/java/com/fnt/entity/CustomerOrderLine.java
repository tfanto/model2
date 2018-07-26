package com.fnt.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer_order_line", indexes = { @Index(columnList = "internalordernumber,lineNumber", name = "customerorderline00", unique = true) })
public class CustomerOrderLine {

	@EmbeddedId
	private CustomerOrderLinePK primarykey;

	@Column(name = "date")
	@NotNull(message = "Customer orderline date cannot be null")
	private LocalDate date;

	@Column(name = "item_id")
	@NotNull(message = "Customer orderline itemId cannot be null")
	private Long itemid;

	@Column(name = "number_of_items")
	@NotNull(message = "Customer orderline number of items cannot be null")
	@Min(value = 1, message = "At least one item must be ordered for a customerorderline")
	private Integer numberofitems;

	@Column(name = "price_per_item")
	@NotNull(message = "Customer orderline price cannot be null")
	@Min(value = 1, message = "Customer order line price cannot be below 1")
	private Double priceperitem;

	public CustomerOrderLinePK getPrimarykey() {
		return primarykey;
	}

	public void setPrimarykey(CustomerOrderLinePK primarykey) {
		this.primarykey = primarykey;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Integer getNumberofitems() {
		return numberofitems;
	}

	public void setNumberofitems(Integer numberofitems) {
		this.numberofitems = numberofitems;
	}

	public Double getPriceperitem() {
		return priceperitem;
	}

	public void setPriceperitem(Double priceperitem) {
		this.priceperitem = priceperitem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
		result = prime * result + ((numberofitems == null) ? 0 : numberofitems.hashCode());
		result = prime * result + ((priceperitem == null) ? 0 : priceperitem.hashCode());
		result = prime * result + ((primarykey == null) ? 0 : primarykey.hashCode());
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
		CustomerOrderLine other = (CustomerOrderLine) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (itemid == null) {
			if (other.itemid != null)
				return false;
		} else if (!itemid.equals(other.itemid))
			return false;
		if (numberofitems == null) {
			if (other.numberofitems != null)
				return false;
		} else if (!numberofitems.equals(other.numberofitems))
			return false;
		if (priceperitem == null) {
			if (other.priceperitem != null)
				return false;
		} else if (!priceperitem.equals(other.priceperitem))
			return false;
		if (primarykey == null) {
			if (other.primarykey != null)
				return false;
		} else if (!primarykey.equals(other.primarykey))
			return false;
		return true;
	}

}
