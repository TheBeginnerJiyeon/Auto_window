package com.ssamz.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtility {
	
	public static Connection getConnection() {
		
		Connection conn=null;
		try {
			DriverManager.registerDriver(new org.h2.Driver());
			
			String jdbcURLString ="jdbc:h2:tcp://localhost/~/test";
			conn=DriverManager.getConnection(jdbcURLString, "sa","");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return conn;
		
		
		
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		
		
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		
		
		try {
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
