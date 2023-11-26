package oauh.projekt.druhy.rocnik;

import java.sql.*;
public class Display {
    public static void main(String[] args) {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_to_sql", "root","");

            Statement statement = connection.createStatement();

            String selectString = "select * from user";
            ResultSet resultSet = statement.executeQuery(selectString);
            System.out.print("\n" + "Současná tabulka:" + "\n" + "\n");
            while(resultSet.next()) {
                System.out.print("Id: " + resultSet.getString("id") + "\n"
                        + "Jméno: " + resultSet.getString("first_name") + "\n"
                        + "Příjmení: " +resultSet.getString("last_name") + "\n" + "\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}