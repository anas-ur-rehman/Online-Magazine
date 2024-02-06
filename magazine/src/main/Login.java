package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {

public static String login_info(String name ,String password) {
String username = null,passwordrs = null;
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con =
DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine","root","");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from admin where name='"+name+"' and password='"+password+"'" );

rs.next();



String login=("username " + rs.getString(2) + " password: " + rs.getString(3));

con.close();
return login;
} catch(Exception e)
{
if(username==name && passwordrs==password) {
System.out.println("successfully login");

}
else {
System.out.println("login failed");
}
//System.out.println("data is not available");
System.out.println(e);
}
return " ";

}
}
