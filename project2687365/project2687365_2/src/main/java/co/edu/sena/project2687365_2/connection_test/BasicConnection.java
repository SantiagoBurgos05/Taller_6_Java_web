package co.edu.sena.project2687365_2.connection_test;
import java.sql.*;

public class BasicConnection {
    public static void main(String[] args){
    String url="jdbc:mysql://localhost:3306/project2687365?serverTimezone=America/Bogota";
    String user_name="root";
    String password="";
        String sql = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            sql = "SELECT * FROM project2687365.users_tbl";
            conn = DriverManager.getConnection(url, user_name, password);
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_lastname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_email"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }// end try-catch
    } // main
} // BasicConnection

