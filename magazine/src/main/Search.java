package main;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebService
public class Search {

    @WebMethod
    public String searchPostsByCategory(@WebParam(name = "category") String category) {
        StringBuilder result = new StringBuilder();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");
                 PreparedStatement pstmt = con.prepareStatement("SELECT description FROM posts WHERE category=?")) {

                pstmt.setString(1, category);

                try (ResultSet rs = pstmt.executeQuery()) {
                    // Check if there is a result
                    if (!rs.isBeforeFirst()) {
                        result.append("No posts found for category: ").append(category);
                    } else {
                        // Process the result set
                        while (rs.next()) {
                            result.append(rs.getString(1)).append("\n");
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
