package com.fnt.entity;

import java.time.LocalDate;

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
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer_order_head", indexes = { @Index(columnList = "ordernumber", name = "customerorderhead00", unique = true), @Index(columnList = "internalordernumber", name = "customerorderhead10", unique = true),
		@Index(columnList = "customerid", name = "customerorderhead20", unique = false) })
@NamedQueries({ @NamedQuery(name = CustomerOrderHead.CUSTOMER_ORDERHEAD_GET_ALL, query = "SELECT coh FROM CustomerOrderHead coh"),
		        })
public class CustomerOrderHead {

	public static final String CUSTOMER_ORDERHEAD_GET_ALL = "customerorderhead.getall";
	public static final String CUSTOMER_ORDERHEAD_UPDATE = "customerorderhead.update";

	@Column(name = "internalordernumber")
	@NotNull
	private String internalordernumber;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "co_generator")
	@SequenceGenerator(name = "co_generator", sequenceName = "co_seq")
	@Column(name = "ordernumber", updatable = false, nullable = false)
	private Long ordernumber;

	@Column(name = "customerid")
	@NotNull
	private Long customerid;

	@Column(name = "date")
	@NotNull
	private LocalDate date;

	@Column(name = "status")
	@NotNull
	private Integer status;

	@Version
	@Column(name = "internal_chgnbr")
	private Long internal_chgnbr;

	@Column(name = "changedby")
	@NotNull
	private String changedby;

	public String getInternalordernumber() {
		return internalordernumber;
	}

	public void setInternalordernumber(String internalordernumber) {
		this.internalordernumber = internalordernumber;
	}

	public Long getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
		result = prime * result + ((customerid == null) ? 0 : customerid.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((internal_chgnbr == null) ? 0 : internal_chgnbr.hashCode());
		result = prime * result + ((internalordernumber == null) ? 0 : internalordernumber.hashCode());
		result = prime * result + ((ordernumber == null) ? 0 : ordernumber.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		CustomerOrderHead other = (CustomerOrderHead) obj;
		if (changedby == null) {
			if (other.changedby != null)
				return false;
		} else if (!changedby.equals(other.changedby))
			return false;
		if (customerid == null) {
			if (other.customerid != null)
				return false;
		} else if (!customerid.equals(other.customerid))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (internal_chgnbr == null) {
			if (other.internal_chgnbr != null)
				return false;
		} else if (!internal_chgnbr.equals(other.internal_chgnbr))
			return false;
		if (internalordernumber == null) {
			if (other.internalordernumber != null)
				return false;
		} else if (!internalordernumber.equals(other.internalordernumber))
			return false;
		if (ordernumber == null) {
			if (other.ordernumber != null)
				return false;
		} else if (!ordernumber.equals(other.ordernumber))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
