package main;

import java.sql.*;

public class AdminLogin {

    public boolean login(String name, String password) {
        boolean loginSuccessful = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");

            // Use a prepared statement with parameterized query
            String query = "SELECT * FROM admin WHERE name=? AND password=?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setString(1, name);
                pstmt.setString(2, password);

                // Execute the query
                ResultSet rs = pstmt.executeQuery();

                // Process the result set
                loginSuccessful = rs.next();
            } // The try-with-resources statement will automatically close the PreparedStatement

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return loginSuccessful;
    }
}
