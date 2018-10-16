package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.revature.models.Employees;
import com.revature.repo.EmployeeDao;
import com.revature.util.HibernateSession;

@SuppressWarnings("serial")
public class EmployeeServlet extends HttpServlet {
	List<Employees> employees;
	EmployeeDao dao = new EmployeeDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		employees = dao.getEmployees();
		resp.setContentType("text/xml");
		ObjectMapper om = new XmlMapper();
		String obj = om.writeValueAsString(employees);
		PrintWriter pw = resp.getWriter();
		pw.print(obj);
		pw.close();
	}
	
	@Override
	public void destroy() {
		HibernateSession.shutdown();
	}
}
