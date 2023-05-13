package co.edu.sena.project2687365_2.connection_test;
import java.sql.*;
public class UseBasicConnectionSingleton {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM project2687365.users_tbl")) {
    while (rs.next()) {
         System.out.print(rs.getString("user_firstname"));
         System.out.print(" | ");
         System.out.print(rs.getString("user_lastname"));
         System.out.print(" | ");
         System.out.print(rs.getString("user_email"));
         System.out.print(" | ");
         System.out.print(rs.getString("user_password"));
        }
        } // end try
    }
}// UseBasicConnectionSingleton
