package com.bank.faisal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlJDBC {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///coffee_store","root","mysql");
			Statement st = con.createStatement();
			String query = "select * from customers";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			con.close();
					
		}catch(SQLException e) {
			System.out.println("Error");
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
// jdbc
