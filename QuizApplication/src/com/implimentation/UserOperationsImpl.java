package com.implimentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.classes.Connections;
import com.interfaces.UserOperations;

public class UserOperationsImpl implements UserOperations {
	
	// method for registration
	@Override
	public void studentRegistration(String firstName, String lastName, String userName, String password, String city,
			String emailId, String mobileNumber) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name:");
		firstName = scanner.nextLine();
		System.out.println("Enter the last name:");
		lastName = scanner.nextLine();
		System.out.println("Enter the username:");
		userName = scanner.nextLine();
		System.out.println("Enter the password:");
		password = scanner.nextLine();
		System.out.println("Enter the city:");
		city = scanner.nextLine();
		System.out.println("Enter the email:");
		emailId = scanner.nextLine();
		System.out.println("Enter the mobile number:");
		mobileNumber = scanner.nextLine();

		try {
			Connections conns = new Connections();
			Connection con = conns.getConnection();

			String query = "INSERT INTO students (first_name, last_name, username, password, city, email, mobile_number, score) VALUES (?, ?, ?, ?, ?, ?, ?, 0)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, userName);
			stmt.setString(4, password);
			stmt.setString(5, city);
			stmt.setString(6, emailId);
			stmt.setString(7, mobileNumber);
			stmt.executeUpdate();
			System.out.println("Student registered successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	// mehod for login
	@Override
	public boolean studentLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username:");
		String username = scanner.nextLine();
		System.out.println("Enter the password:");
		String password = scanner.nextLine();

		try {
			Connections conns = new Connections();
			Connection con = conns.getConnection();

			String query = "SELECT * FROM students WHERE username = ? AND password = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				System.out.println("Login successful!");
				return true;
			} else {
				System.out.println("Invalid username or password.");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
	
	
     //method for question list
	@Override
	public void qustionsList() {
		// TODO Auto-generated method stub

	}
    
	
	
	@Override
	public void storeQuizResult() {
		// TODO Auto-generated method stub

	}

	
	
	@Override
	public void displayQuizResult() {
		// TODO Auto-generated method stub

	}

}
