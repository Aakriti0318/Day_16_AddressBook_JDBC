import java.sql.*;
public class CreateDatabase {
    public void createdb(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Banda@123")) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE DATABASE AddressBookDB");
            System.out.println("Database AddressBookDB created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
