package oauh.projekt.druhy.rocnik;

import java.sql.*;
public class Add {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_to_sql", "root", "" );
                Statement statement = connection.createStatement();){

            String Add = "insert into user values (1, 'test1', 'test1')";
            int countAdded = statement.executeUpdate(Add);
            System.out.print(countAdded + " user/s added.\n");

            String selectString = "select * from user";
            ResultSet resultSet = statement.executeQuery(selectString);

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
