import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void printSpace() {
        System.out.print("\n");
    }
    public static void main(String[] args) {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_to_sql", "root","");

            Statement statement = connection.createStatement();

            ResultSet resultset = statement.executeQuery("select * FROM user");

            while (resultset.next()) {
                System.out.print("id: ");
                System.out.print(resultset.getString("id"));
                printSpace();
                System.out.print("Křestní jméno: ");
                System.out.print(resultset.getString("first_name"));
                printSpace();
                System.out.print("Příjmení: ");
                System.out.print(resultset.getString("last_name"));
                printSpace();
                printSpace();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}