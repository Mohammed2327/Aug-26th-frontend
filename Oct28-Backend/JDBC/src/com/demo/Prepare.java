package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepare {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	int id=90;
	String name= "Mujju";
	int val = 77;
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Mujeeb1@#");
	 PreparedStatement psmt= conn.prepareStatement("insert into student values(?,?,?)");
	
	 psmt.setInt(1, id);
	 psmt.setString(2, name);
	 psmt.setInt(3, val);
	 
	int insertrecord =  psmt.executeUpdate(); 
	
	conn.close();
	
	System.out.println("Record Inserted: " +insertrecord);
}
}
