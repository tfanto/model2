package com.fnt.dto;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

public class CustomerOrderHeadListView {

	private static final int ID = 0;
	private static final int CUSTOMERNUMBER = 1;
	private static final int NAME = 2;
	private static final int DATE = 3;
	private static final int CHANGEDBY = 4;
	private static final int STATUS = 5;

	private Long id;
	private String customernumber;
	private String name;
	private LocalDate date;
	private String changedby;
	private Integer status;

	public CustomerOrderHeadListView() {

	}

	public CustomerOrderHeadListView(Object record[]) {

		try {
			id = Long.parseLong(str(record[ID]));
		} catch (RuntimeException r) {
			id = Long.MIN_VALUE;
		}
		customernumber = str(record[CUSTOMERNUMBER]);
		name = str(record[NAME]);

		String dateStr = str(record[DATE]);
		// todo convert to LocalDateTime
		try {
			Timestamp ts = Timestamp.valueOf(dateStr);
			date = LocalDate.ofEpochDay(ts.getTime());
		} catch (RuntimeException e) {
			date = LocalDate.now();
		}

		changedby = str(record[CHANGEDBY]);
		try {
			status = Integer.parseInt(str(record[STATUS]));
		} catch (RuntimeException r) {
			status = Integer.MIN_VALUE;
		}

	}

	private String str(Object obj) {
		try {
			return String.valueOf(obj);
		} catch (RuntimeException e) {
			return "";
		}
	}

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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getChangedby() {
		return changedby;
	}

	public void setChangedby(String changedby) {
		this.changedby = changedby;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((changedby == null) ? 0 : changedby.hashCode());
		result = prime * result + ((customernumber == null) ? 0 : customernumber.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
