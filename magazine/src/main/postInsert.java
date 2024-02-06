package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class postInsert {
	public static void main(String title, String description)
	{
		try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");
                 Statement stmt = con.createStatement()) {

                String query = "INSERT INTO posts (title, category, description, likes) "
                		+ "VALUES ('" + title + "' , '" + title + "' , '" + description + "' , '" + 0 + "')";
                int rows =stmt.executeUpdate(query);
                if (rows>0) {
                	System.out.println("Query fire successfullty");
                }
                else {
                	System.out.println("Query rejected");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
