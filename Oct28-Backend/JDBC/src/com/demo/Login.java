package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Username: ");
	String uname = sc.next();
	System.out.println("Enter the Password: ");
	String pswd = sc.next();
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Mujeeb1@#");
	PreparedStatement psmt = conn.prepareStatement(" select * from login where username=? and password=?");
	
	psmt.setString(1, uname);
	psmt.setString(2, pswd);
	
	ResultSet res= psmt.executeQuery();
	
	if(res.next()) {
		System.out.println("Login Success.... Welcome to Homepage");
	}
	else {
		System.out.println("Ooops.... Login Failed");
	}
	
	
}
}
