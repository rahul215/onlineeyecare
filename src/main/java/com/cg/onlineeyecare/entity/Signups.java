package com.cg.onlineeyecare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Signups {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(updatable=false,unique=true)
	private String username;
	private String password;
	
	public Signups(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Signups() {
		// TODO Auto-generated constructor stub
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
	
	@Override
	public String toString() {
		return "Signups [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
		
	
}
