package com.csi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.csi.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	Connection connection = null;

	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDBMgnt", "root", "root");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void signup(Employee employee) {
		// TODO Auto-generated method stub

		String insertSQL = "insert into employee(empid, empname, empaddress, empsalary, empemailid, empcontactnumber)values(?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement preparedStatement=connection.prepareStatement(insertSQL);
		
			preparedStatement.setInt(1, employee.getEmpId());
			
			preparedStatement.setString(2, employee.getEmpName());
			
			preparedStatement.setString(3, employee.getEmpAddress());
			
			preparedStatement.setDouble(4, employee.getEmpSalary());
			
			preparedStatement.setString(5, employee.getEmpEmailId());
			
			preparedStatement.setLong(6, employee.getEmpContactNumber());
			
			
			preparedStatement.executeUpdate();
			
			System.out.println("Employee Signup Done successfully");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
