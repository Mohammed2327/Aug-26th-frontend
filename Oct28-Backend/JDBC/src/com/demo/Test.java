package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//1. Loading the driver
	Class.forName("com.mysql.jdbc.Driver");
	
	//2. get the connection
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Mujeeb1@#");
	
	//3. create statement
	Statement stmt = conn.createStatement();
	
	//4. execute the statement
	// if DDL - execute() method
	// if DML - executeUpdate() method
	// if DRL - executeQuery() method
	// boolean result =stmt.execute(" create table student(stid int, sname varchar(20), stmarks int)");
	// int result = stmt.executeUpdate("Insert into student values(124, 'Najeeb', 70)");
	// int result=stmt.executeUpdate("update student set sname='Yousuf' where stid=124");
	
	ResultSet res= stmt.executeQuery("select * from student");
	
	while(res.next()) {
		System.out.println(res.getInt(1)+ " "+ res.getString(2) + " "+ res.getInt(3));
	}
	
// 	int result = stmt.executeUpdate("delete from student where stid=124");
	//5. close the connection
	conn.close();
	
	// System.out.println("Table Created: " +result);
	// System.out.println("Record Inserted: " +result);
	// System.out.println("Record Updated: " +result);
	// System.out.println("Record Deleted: " +result);
}
}
