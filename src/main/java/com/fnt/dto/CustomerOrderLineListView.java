package com.fnt.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerOrderLineListView {

	private static final int INTERNAL_ORDER_NUMBER = 0;
	private static final int LINE_NUMBER = 1;
	private static final int DATE = 2;
	private static final int ITEM_NUMBER = 3;
	private static final int ITEM_DESCRIPTION = 4;
	private static final int UNITS = 5;
	private static final int PRICE_PER_ITEM = 6;

	private String internal_ordernumber;
	private Long linennumber;
	private String itemnumber;
	private String description;
	private Long units;
	private Double priceperitem;
	private LocalDate date;
	private Double linetotal;

	public CustomerOrderLineListView() {

	}

	public CustomerOrderLineListView(Object record[]) {

		internal_ordernumber = str(record[INTERNAL_ORDER_NUMBER]);

		try {
			linennumber = Long.parseLong(str(record[LINE_NUMBER]));
		} catch (RuntimeException r) {
			linennumber = Long.MIN_VALUE;
		}

		String aDate = str(record[DATE]);
		// todo convert to LocalDateTime
		try {
			date = LocalDate.parse(aDate, DateTimeFormatter.ISO_LOCAL_DATE);
		} catch (RuntimeException e) {
			date = LocalDate.now();
		}

		itemnumber = str(record[ITEM_NUMBER]);

		description = str(record[ITEM_DESCRIPTION]);

		try {
			units = Long.parseLong(str(record[UNITS]));
		} catch (RuntimeException r) {
			units = Long.MIN_VALUE;
		}

		try {
			priceperitem = Double.parseDouble(str(record[PRICE_PER_ITEM]));
		} catch (RuntimeException r) {
			units = Long.MIN_VALUE;
		}
	}

	public String getInternal_ordernumber() {
		return internal_ordernumber;
	}

	public void setInternal_ordernumber(String internal_ordernumber) {
		this.internal_ordernumber = internal_ordernumber;
	}

	public Long getLinennumber() {
		return linennumber;
	}

	public void setLinennumber(Long linennumber) {
		this.linennumber = linennumber;
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

	public Long getUnits() {
		return units;
	}

	public void setUnits(Long units) {
		this.units = units;
	}

	public Double getPriceperitem() {
		return priceperitem;
	}

	public void setPriceperitem(Double priceperitem) {
		this.priceperitem = priceperitem;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getLinetotal() {
		return priceperitem * units;
	}

	public void setLinetotal(Double linetotal) {
		this.linetotal = linetotal;
	}

	private String str(Object obj) {
		try {
			return String.valueOf(obj);
		} catch (RuntimeException e) {
			return "";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((internal_ordernumber == null) ? 0 : internal_ordernumber.hashCode());
		result = prime * result + ((itemnumber == null) ? 0 : itemnumber.hashCode());
		result = prime * result + ((linennumber == null) ? 0 : linennumber.hashCode());
		result = prime * result + ((linetotal == null) ? 0 : linetotal.hashCode());
		result = prime * result + ((priceperitem == null) ? 0 : priceperitem.hashCode());
		result = prime * result + ((units == null) ? 0 : units.hashCode());
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
		CustomerOrderLineListView other = (CustomerOrderLineListView) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (internal_ordernumber == null) {
			if (other.internal_ordernumber != null)
				return false;
		} else if (!internal_ordernumber.equals(other.internal_ordernumber))
			return false;
		if (itemnumber == null) {
			if (other.itemnumber != null)
				return false;
		} else if (!itemnumber.equals(other.itemnumber))
			return false;
		if (linennumber == null) {
			if (other.linennumber != null)
				return false;
		} else if (!linennumber.equals(other.linennumber))
			return false;
		if (linetotal == null) {
			if (other.linetotal != null)
				return false;
		} else if (!linetotal.equals(other.linetotal))
			return false;
		if (priceperitem == null) {
			if (other.priceperitem != null)
				return false;
		} else if (!priceperitem.equals(other.priceperitem))
			return false;
		if (units == null) {
			if (other.units != null)
				return false;
		} else if (!units.equals(other.units))
			return false;
		return true;
	}

}
