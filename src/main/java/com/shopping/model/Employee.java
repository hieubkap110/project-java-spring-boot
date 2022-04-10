package com.shopping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", nullable = false)
	 private long id;
	 
	 @Column(name = "name", nullable = false)
	 private String name;
	 
	 @Column(name = "phone")
	 private String phone;
	 
	 public Employee() {
		// TODO Auto-generated constructor stub
		 super();
	}
	 
	 public Employee(int id, String name, String phone) {
		 super();
		 this.id = id;
		 this.name = name;
		 this.phone = phone;
	 }

	public long getId() {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
