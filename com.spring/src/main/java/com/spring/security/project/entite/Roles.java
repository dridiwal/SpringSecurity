package com.spring.security.project.entite;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String role;
	
	private String discription;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Roles(String role, String discription) {
		super();
		this.role = role;
		this.discription = discription;
	}

	
}
