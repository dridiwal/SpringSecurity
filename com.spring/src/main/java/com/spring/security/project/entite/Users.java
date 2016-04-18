package com.spring.security.project.entite;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;
@Entity
public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String username;
	private String password;
	private boolean actived;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="USERS_ROLES")
	private Collection<Roles> roles;
	
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
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public Collection<Roles> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Roles> roles) {
		this.roles = roles;
	}
	public Users(String username, String password, boolean actived) {
		super();
		this.username = username;
		this.password = password;
		this.actived = actived;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
