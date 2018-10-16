package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_USERS")
public class Employees {
	@Id
	@Column(name = "EMP_ID")
	int id;
	
	@Column(name = "EMP_NAME")
	String username;
	
	@Column(name = "EMP_PASSWORD")
	String password;
	
	@Column(name = "EMP_FIRSTNAME")
	String fname;
	
	@Column(name = "EMP_LASTNAME")
	String lname;
	
	@Column(name = "EMP_EMAIL")
	String email;
	
	@Column(name = "R_ID")
	int r_id;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "EMP_ROLES")
	Roles roles;
	
	public Employees(int id, String username, String password, String fname, String lname, String email, int r_id) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.r_id = r_id;
	}

	public Employees() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", username=" + username + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", email=" + email + ", r_id=" + r_id + "]";
	}
}
