package exercise;

import java.sql.*;

public class SQL03 {
    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Asdasd123stella.");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while(resultSet.next()) {
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                String[] surname = {last_name};
                System.out.println(first_name);
                System.out.println(surname[0]);

            }

        } catch (SQLException e) {
            e.getMessage();
        }

    }

}
