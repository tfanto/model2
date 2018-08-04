package com.fnt.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDto implements Serializable {

	private List<String> allowedRoles = Arrays.asList("ADMIN", "USER", "GUEST");
	private static final long serialVersionUID = -8060196328184476479L;
	private String login = null;
	private String password = null;
	private List<String> roles = new ArrayList<>();

	public UserDto() {
	}

	public UserDto(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public UserDto(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getAllowedRoles() {
		return allowedRoles;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void addRole(String role) {

		if (!allowedRoles.contains(role)) {
			return;
		}

		if (!roles.contains(role)) {
			roles.add(role);
		}
	}

}
