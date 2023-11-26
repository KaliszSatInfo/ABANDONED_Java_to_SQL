package oauh.projekt.druhy.rocnik;

import java.sql.*;
public class Update {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_to_sql", "root", "" );
                Statement statement = connection.createStatement()){

            String Update = "update user set first_name = 'Petr', last_name = 'Novák' where id = 1";
            int countUpdated = statement.executeUpdate(Update);
            System.out.print(countUpdated + " user/s updated." + "\n");

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
