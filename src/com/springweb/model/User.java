package com.springweb.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
	@NotEmpty
	@Size(min=4 , max=10)
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	private String email;
	private boolean enabled = false;
	private String authority;
	public User(String username, String password, String email, boolean enabled, String authority) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.authority = authority;
	}

	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
