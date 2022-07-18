package com.cg.onlineeyecare.model;

import org.springframework.stereotype.Component;

@Component
public class SignUpDTO {
	
	private int id;
	private String username;
	private String password;
	
	public SignUpDTO(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public SignUpDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "SignUpDTO [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	
	
	
}
