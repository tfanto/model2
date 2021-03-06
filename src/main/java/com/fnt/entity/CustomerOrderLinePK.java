package com.fnt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class CustomerOrderLinePK implements Serializable {

	private static final long serialVersionUID = -5440501566930394197L;

	@Column(name = "internalordernumber")
	@NotNull
	private String internalordernumber;

	@NotNull(message = "Customer orderline linenumber cannot be null")
	private Long lineNumber;

	public CustomerOrderLinePK() {

	}

	public CustomerOrderLinePK(String internalordernumber, Long lineNumber) {
		this.internalordernumber = internalordernumber;
		this.lineNumber = lineNumber;
	}

	public String getInternalordernumber() {
		return internalordernumber;
	}

	public void setInternalordernumber(String internalordernumber) {
		this.internalordernumber = internalordernumber;
	}

	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((internalordernumber == null) ? 0 : internalordernumber.hashCode());
		result = prime * result + ((lineNumber == null) ? 0 : lineNumber.hashCode());
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
		CustomerOrderLinePK other = (CustomerOrderLinePK) obj;
		if (internalordernumber == null) {
			if (other.internalordernumber != null)
				return false;
		} else if (!internalordernumber.equals(other.internalordernumber))
			return false;
		if (lineNumber == null) {
			if (other.lineNumber != null)
				return false;
		} else if (!lineNumber.equals(other.lineNumber))
			return false;
		return true;
	}

}
