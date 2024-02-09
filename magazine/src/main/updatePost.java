package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class updatePost {

	public static void main(int ID, String category,  String description) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");
                 Statement stmt = con.createStatement()) {

                //String query = " posts (title, category, description, image_Url, date, likes) "
                	//	+ "VALUES ( , '" + category + "' , '" + description + "' ,  ,  , '" + 0 + "')";
                
            	String query ="update posts set title ='" + category + "', category='" + category+ "', description ='" + description + "' where Post_Id = '"+ID+"'";
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
	
	public int getid(String des) {
	    int postId = -1; // Default value if no result is found

	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");
	             Statement stmt = con.createStatement()) {

	            String query = "SELECT Post_Id FROM posts WHERE description ='" + des + "'";
	            ResultSet resultSet = (ResultSet) stmt.executeQuery(query);

	            if (resultSet.next()) {
	                // Retrieve the Post_Id from the result set
	                postId = resultSet.getInt("Post_Id");
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return postId;
	}

}
