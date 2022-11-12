package com.pk.AdvJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class RsMeta {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "student", "student");
				Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery("select * from account");
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			
			for(int i=1 ; i<columnCount ;i++) {
				System.out.println(md.getColumnName(i));
				System.out.println(md.getColumnTypeName(i));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
