package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=Mani@123&&useSSl=false");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select*from Students where id=45");
			rs.next();
			int id=rs.getInt("id");
			String name=rs.getString("name");
			double marks=rs.getDouble("marks");
			String city =rs.getString("city");
			System.out.println(id+" "+name+" "+marks+" "+city);
			st.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
