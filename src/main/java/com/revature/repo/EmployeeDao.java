package com.revature.repo;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Employees;
import com.revature.util.HibernateSession;

public class EmployeeDao {
	@SuppressWarnings("unchecked")
	public List<Employees> getEmployees() {
		Session session = HibernateSession.getSession();
		return session.createQuery("from EMP_USERS").list();
	}
}
