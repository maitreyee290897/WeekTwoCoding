package com.pack.JDBCtut;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String srgs[]){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day3","root","Sapient123");
		Statement stmt= con.createStatement();
		
		//stmt.executeUpdate("insert into EMP values('jeetendra',28)");
		//stmt.executeUpdate("delete from EMP where AGE>21");
		stmt.executeUpdate("update EMP set AGE=AGE+1");
		
		
		ResultSet rs = stmt.executeQuery("select * from EMP");
		while(rs.next()){
			System.out.println("name: " + rs.getString(1));
			System.out.println("age: " + rs.getInt(2));
			System.out.println();
			
		}
		//rs.close();
		con.close();
		stmt.close();
	}
	catch(Exception e){
	
		System.out.println(e);
	}
}
}
