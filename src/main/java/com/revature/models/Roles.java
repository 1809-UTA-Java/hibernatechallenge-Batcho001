package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_ROLES")
public class Roles {
	@Id
	@Column(name = "R_ID")
	int r_id;
	
	@Column(name = "R_ROLE")
	String role;
	
	public Roles(int r_id, String role) {
		super();
		this.r_id = r_id;
		this.role = role;
	}

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Roles [r_id=" + r_id + ", role=" + role + "]";
	};
	
}
