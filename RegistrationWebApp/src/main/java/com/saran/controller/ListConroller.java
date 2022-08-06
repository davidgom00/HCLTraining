package com.saran.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saran.dao.EmployeeDAO;
import com.saran.model.Employee;

@WebServlet("/listEmployees")
public class ListConroller extends HttpServlet {

	 protected void showList(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
}
