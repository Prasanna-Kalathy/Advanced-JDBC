package com.pk.AdvJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrncMgmt {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "student", "student");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("update account set bal=bal-5000 where accno=1");
			stmt.executeUpdate("update account set bal=bal+5000 where accno=2");
			con.commit();
		} catch (SQLException e) {
			try {
				con.close();
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}
}