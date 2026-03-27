package com.spring.bean.lifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class StudentDAO {
	private String driver;
	private String url;
	private String username;
	Connection con;

	public void setDriver(String driver) {
		System.out.println("Setting Driver...");
		this.driver = driver;
	}

	public void setUrl(String url) {
		System.out.println("Setting URL...");
		this.url = url;
	}

	public void setUsername(String username) {
		System.out.println("Setting Username...");
		this.username = username;
	}

//	@PostConstruct
	public void init() {
		System.out.println("Init method of student DAO class is called...");
		createStudentDBConnection();
	}
	
	public void createStudentDBConnection() {
	    try {
	        Class.forName(driver);
	        con = DriverManager.getConnection(url, username, "");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		// loadDriver
		Class.forName(driver);

		// get a connection
		Connection con = DriverManager.getConnection(url, username, "");

		// execute query
		Statement stat = con.createStatement();
		ResultSet rs = stat.executeQuery("select * from hostelStudentInfo");
		while (rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelFees = rs.getDouble(3);
			String foodType = rs.getString(4);

			System.out.println(studentId + " " + studentName + " " + hostelFees + " " + foodType);
		}
		con.close();
	}

	public void deleteRecort(int id) throws ClassNotFoundException, SQLException {

		// execute query
		Statement stat = con.createStatement();
		stat.executeUpdate("delete from hostelStudentInfo where student_id=" + id);

		System.out.println("deleted record of student with id: " + id);
		con.close();
	}
	
	public void connectionClose() throws SQLException {
		con.close();
	}

//	@PreDestroy
	public void destroy() throws SQLException {
		//clean up job
		System.out.println("Calling custom destroy method of StudentDAO..");
		connectionClose();
	}
	
}
