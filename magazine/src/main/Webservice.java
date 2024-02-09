package main;

import java.sql.*;

public class Webservice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from posts");

			while(rs.next())
			{
			System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Password: "
			+ rs.getString(4));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}

	}

}
