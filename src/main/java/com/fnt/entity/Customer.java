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
import javax.persistence.Version;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer", indexes = { @Index(columnList = "id", name = "customer00", unique = true),
		@Index(columnList = "customernumber", name = "customer10", unique = true), })
@NamedQueries({ @NamedQuery(name = Customer.CUSTOMER_GET_ALL, query = "SELECT c FROM Customer c"), })
public class Customer {

	public static final String CUSTOMER_GET_ALL = "customer.getall";

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
	@SequenceGenerator(name = "customer_generator", sequenceName = "customer_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@NotEmpty
	@Size(max = 50)
	@Column(name = "customernumber", unique = true)
	private String customernumber;

	@NotEmpty
	@Size(max = 50)
	@NotEmpty
	@Column(name = "name")
	private String name;

	@NotEmpty
	@Size(max = 250)
	@Column(name = "description")
	private String description;
	
	@Version
	@Column(name = "internal_chgnbr")
	private Long internal_chgnbr;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getInternal_chgnbr() {
		return internal_chgnbr;
	}

	public void setInternal_chgnbr(Long internal_chgnbr) {
		this.internal_chgnbr = internal_chgnbr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customernumber == null) ? 0 : customernumber.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((internal_chgnbr == null) ? 0 : internal_chgnbr.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (customernumber == null) {
			if (other.customernumber != null)
				return false;
		} else if (!customernumber.equals(other.customernumber))
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
		if (internal_chgnbr == null) {
			if (other.internal_chgnbr != null)
				return false;
		} else if (!internal_chgnbr.equals(other.internal_chgnbr))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}
