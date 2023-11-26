package oauh.projekt.druhy.rocnik;

import java.sql.*;
public class Delete {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_to_sql", "root", "" );
                Statement statement = connection.createStatement()){

            String Delete = "delete from user where id >= 1";
            int countDeleted = statement.executeUpdate(Delete);
            System.out.print(countDeleted + " user/s deleted." + "\n");

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}