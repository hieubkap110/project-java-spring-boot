package com.shopping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "User_Name", length = 20, nullable = false)
	private String userName;

	@Column(name = "Encryted_Password", length = 128, nullable = false)
	private String encrytedPassword;

	@Column(name = "Active", length = 1, nullable = false)
	private boolean active;

	@Column(name = "User_Role", length = 20, nullable = false)
	private String userRole;

	public Account() {
		super();
	}

	public Account(String userName, String encrytedPassword, boolean active, String userRole) {
		super();
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
		this.active = active;
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
