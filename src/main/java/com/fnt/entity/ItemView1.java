package com.fnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "item")
public class ItemView1 {

	@Column(name = "id", updatable = false, nullable = false)
	@Id
	private Long id;

	@NotEmpty(message="itemnumber must have a value")
	@Size(max = 50, message="max length for itemnumber is 50")
	@Column(name = "itemnumber", unique = true)
	private String itemnumber;

	@NotEmpty(message="description must have a value")
	@Size(max = 250, message="max length for description is 250")
	@Column(name = "description")
	private String description;

	@Min(value = 1, message = "instock must have a value")
	@Column(name = "in_stock")
	private Integer instock;

	@Min(value = 1, message = "price must have a value")
	@Column(name = "price")
	private Double price;
	
	@Version
	@Column(name = "internal_chgnbr")
	private Long internal_chgnbr;
	
	@Column(name = "changedby")
	@NotNull
	private String changedby;


	public ItemView1() {

	}

	public ItemView1(String itemnumber, String description, Integer instock, Double price) {
		this.itemnumber = itemnumber;
		this.description = description;
		this.instock = instock;
		this.price = price;
	}

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

	public Integer getInstock() {
		return instock;
	}

	public void setInstock(Integer instock) {
		this.instock = instock;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getInternal_chgnbr() {
		return internal_chgnbr;
	}

	public void setInternal_chgnbr(Long internal_chgnbr) {
		this.internal_chgnbr = internal_chgnbr;
	}
	
	
	public String getChangedby() {
		return changedby;
	}

	public void setChangedby(String changedby) {
		this.changedby = changedby;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((changedby == null) ? 0 : changedby.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((instock == null) ? 0 : instock.hashCode());
		result = prime * result + ((internal_chgnbr == null) ? 0 : internal_chgnbr.hashCode());
		result = prime * result + ((itemnumber == null) ? 0 : itemnumber.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		ItemView1 other = (ItemView1) obj;
		if (changedby == null) {
			if (other.changedby != null)
				return false;
		} else if (!changedby.equals(other.changedby))
			return false;
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
		if (instock == null) {
			if (other.instock != null)
				return false;
		} else if (!instock.equals(other.instock))
			return false;
		if (internal_chgnbr == null) {
			if (other.internal_chgnbr != null)
				return false;
		} else if (!internal_chgnbr.equals(other.internal_chgnbr))
			return false;
		if (itemnumber == null) {
			if (other.itemnumber != null)
				return false;
		} else if (!itemnumber.equals(other.itemnumber))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}


	

}
