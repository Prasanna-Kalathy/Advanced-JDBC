package com.pk.AdvJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class BatchDAO {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "student", "student");
				Statement stmt = con.createStatement();) {
			stmt.addBatch("insert into account values(1,'Nine Tailed ','fox',500000)");
			stmt.addBatch("insert into account values(2,'Naruto ','Uzumaki',100000)");
			int[] batch = stmt.executeBatch();
			for (int i = 0; i < batch.length; i++) {
				System.out.println(batch[i]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
