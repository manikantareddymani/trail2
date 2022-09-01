package com.jdbc;

import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcstep1 {

	public static void main(String[] args) {

		Scanner t=new Scanner(System.in);
		System.out.println("Enter driver name:");
		String dr=t.next();
		System.out.println("Enter URL:");
		String url=t.next();
		String query ="insert into adjava.student values(330.'jspider',69.23)";
		try {
			Class.forName(dr);
			System.out.println("loading and registering:");
			Connection cn=DriverManager.getConnection(url);
			System.out.println("Connection created:");
			Statement st=cn.createStatement();
			System.out.println("platform created:");
			st.execute(query);
			System.out.println("data inserted");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}

}
