package com.fnt.dto;

/* for customerorderlistview  grid and search
 * 
 */
public class CustomerOrderHeadListView {

	private Long ordernumber;
	private String customerid;
	private String customernumber;
	private String name;
	private String date;
	private String status;
	private String changedby;

	public Long getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		result = prime * result + ((customernumber == null) ? 0 : customernumber.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		CustomerOrderHeadListView other = (CustomerOrderHeadListView) obj;
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
		if (customernumber == null) {
			if (other.customernumber != null)
				return false;
		} else if (!customernumber.equals(other.customernumber))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
