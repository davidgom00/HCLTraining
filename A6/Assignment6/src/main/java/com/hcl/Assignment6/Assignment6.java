package com.hcl.Assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.CallableStatement;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "#Spirit000");
		
		Scanner in = new Scanner(System.in);
		
		Statement st = con.createStatement();
		CallableStatement cst=con.prepareCall("{call insertEmp(?,?,?)}");
		PreparedStatement pst=con.prepareStatement("delete from emp where id = ?");
		PreparedStatement upst = con.prepareStatement("update emp set name=?, age =? where id =?");
		
		System.out.println("What would you like to do? Get list of employees (E) Update employees (U) Delete employees (D) Get a specific employee (G)");
		
		char option = in.next().charAt(0);
		
		System.out.println(option);
		//i)get list of employees
		if(option == 'e') {
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println("Emp Number: "+rs.getInt(1));
				System.out.println("Empt Name: " +rs.getString("name"));
				System.out.println("Emp Age: " + rs.getInt("age"));
			}
		}
		
		
		//ii)Update existing employee based on id
			if(option == 'u') {
				System.out.println("Please enter the employee id followed by, their updated name and age (Press enter between each entry):");
					
				int id = in.nextInt();
				
				String name = in.next();
				int age = in.nextInt();
				
				cst.setInt(1,  id);
				cst.setString(2, name);
				cst.setInt(3, age);
				cst.execute();
				System.out.println("Callable statement record inserted");
				
			}
		
		//iii) Delete an employee based on the employee id
			
			
			if(option == 'd') {
				System.out.println("Please enter the employee id: ");
				int id = in.nextInt();
				pst.setInt(1,id); //1 refers to first parameter
				int x = pst.executeUpdate();
				System.out.println(x +" records deleted");
				
			}
			
		
		//iV) Get employee by id 
			
			if(option == 'g') {
				
				System.out.println("Enter id of employee you want to see: ");
				int empId = in.nextInt();
				st.execute("Select from emp where id = {empId}");
				
				
			}

			in.close();
			
	}
	
	
}
