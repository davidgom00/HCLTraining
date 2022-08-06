package com.saran.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saran.dao.EmployeeDAO;
import com.saran.model.Employee;

@WebServlet("/delete")
public class deleteEmployee extends HttpServlet{

	 private EmployeeDAO employeeDAO;//HAS A

	    public void init() {
	        employeeDAO = new EmployeeDAO();
	    }
	    
	 protected void deleteEmp(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		
		 String id = request.getParameter("id");
		 
		 
	 }
	
}
