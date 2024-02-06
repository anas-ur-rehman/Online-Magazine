package main;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebService
public class getpost {

    @WebMethod
    public String get_post(@WebParam(name = "posttitle") String posttitle) {
    	
        StringBuilder result = new StringBuilder();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");
                 PreparedStatement pstmt = con.prepareStatement("SELECT * FROM posts WHERE category=? order by Post_Id desc")) {

                pstmt.setString(1, posttitle);

                try (ResultSet rs = pstmt.executeQuery()) {
                    // Check if there is a result
                    if (!rs.isBeforeFirst()) {
                        result.append("No posts found for category: ");
                    } else {
                        // Process the result set
                        	rs.next();
                            result.append(rs.getString(4)).append("\n");
                        
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
