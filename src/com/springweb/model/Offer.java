package com.springweb.model;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Offer {
	private int id;
	@NotEmpty
	@Size(min = 4, max = 10, message = "Please Enter your Name (Min 4 chars, Max 10 chars)")
	private String name;
	@NotEmpty
	@Email(message = "Please Enter your Email")
	private String email;
	@NotEmpty(message = "Please Enter your Text")
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Offer(int id, String name, String email, String text) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public Offer() {
		super();
	}

	public Offer(String name, String email, String text) {
		super();
		this.name = name;
		this.email = email;
		this.text = text;
	}

}
