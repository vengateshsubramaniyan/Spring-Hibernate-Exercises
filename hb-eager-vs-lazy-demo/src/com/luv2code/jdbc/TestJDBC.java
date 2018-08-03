package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:postgresql://localhost/test?user=postgres&password=postgres&ssl=false";
		try {
			System.out.println("Connecting to database " + jdbcURL);
			Connection conn = DriverManager.getConnection(jdbcURL);
			System.out.println("Connection successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
