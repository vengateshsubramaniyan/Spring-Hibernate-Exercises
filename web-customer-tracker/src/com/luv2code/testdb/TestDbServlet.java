package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.postgresql.Driver;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String jdbcURL = "jdbc:postgresql://localhost/test?user=postgres&password=postgres&ssl=false";
		
		try {
			PrintWriter out = response.getWriter();
			Class.forName("org.postgresql.Driver");
			out.println("Connecting to " + jdbcURL);
			Connection conn = DriverManager.getConnection(jdbcURL);
			out.println("Connection successful");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
