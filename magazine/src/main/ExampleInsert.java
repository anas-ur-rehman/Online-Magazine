package main;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebService
public class ExampleInsert {

    @WebMethod
    public void insertReview(@WebParam(name = "comment") String comment) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazine", "root", "");
                 Statement stmt = con.createStatement()) {

                String query = "INSERT INTO reviews (comments) VALUES ('" + comment + "')";
                stmt.executeUpdate(query);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
