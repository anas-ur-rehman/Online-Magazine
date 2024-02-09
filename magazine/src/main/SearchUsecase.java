package main;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebService

public class SearchUsecase {
	@WebMethod

	public static String getdescription(@WebParam(name = "searched") String searched) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();

		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");
		         PreparedStatement pstmt = con.prepareStatement("SELECT title, description FROM posts WHERE CONCAT(category, title, description) LIKE ?")) {

		        pstmt.setString(1, "%" + searched + "%");

		        try (ResultSet rs = pstmt.executeQuery()) {
		            // Check if there is a result
		            if (!rs.isBeforeFirst()) {
		                result.append("No posts found for this search: ");
		            } else {
		                // Process the result set
		                while (rs.next()) {
		                    result.append(rs.getString(1)).append("\n").append(rs.getString(2)).append("\n");
		                }
		            }
		        }
		    }
		} catch (Exception e) {
            // Handle the exception more gracefully, e.g., log it
            result.append("An error occurred: ").append(e.getMessage());
        }

        return result.toString();
		

	}

}
