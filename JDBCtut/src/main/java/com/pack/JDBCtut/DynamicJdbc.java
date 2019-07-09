package com.pack.JDBCtut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.PreparedStatement;

public class DynamicJdbc {
	
	public static void main(String srgs[]){
		try{
			
			Scanner sc =new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day3","root","Sapient123");
			
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("insert into EMP values(?,?)");
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter age");
			int age=sc.nextInt();
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.execute();
			ResultSet rs = pstmt.executeQuery("select * from EMP");
			while(rs.next()){
				System.out.println("name: " + rs.getString(1));
				System.out.println("age: " + rs.getInt(2));
				System.out.println();
				
			}
			//rs.close();
			pstmt.close();
			con.close();
			//stmt.close();
		}
		catch(Exception e){
		
			System.out.println(e);
		}
	}
	}
