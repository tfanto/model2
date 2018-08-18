package com.fnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "appuser", indexes = { @Index(columnList = "login", name = "appuser00", unique = true),  })
@NamedQueries({ @NamedQuery(name = AppUser.APPUSER_GET_ALL, query = "SELECT u FROM AppUser u"), 
	         })
public class AppUser {

	public static final String APPUSER_GET_ALL = "appuser.getall";

	public AppUser() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "login", updatable = false, nullable = false)
	@Email
	private String login;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "street")
	private String street;

	@Column(name = "ponr")
	private String ponr;

	@Column(name = "padr")
	private String padr;

	@Column(name = "country")
	private String country;

	@Column(name = "phone")
	private String phone;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPonr() {
		return ponr;
	}

	public void setPonr(String ponr) {
		this.ponr = ponr;
	}

	public String getPadr() {
		return padr;
	}

	public void setPadr(String padr) {
		this.padr = padr;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((padr == null) ? 0 : padr.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((ponr == null) ? 0 : ponr.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		AppUser other = (AppUser) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (padr == null) {
			if (other.padr != null)
				return false;
		} else if (!padr.equals(other.padr))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (ponr == null) {
			if (other.ponr != null)
				return false;
		} else if (!ponr.equals(other.ponr))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	
	
	
	
	

}
