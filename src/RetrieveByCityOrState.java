import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RetrieveByCityOrState {
    public void retrieve(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBookDB", "root", "Banda@123")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter city or state:");
            String location = scanner.nextLine();

            String query = "SELECT * FROM Contact WHERE city = ? OR state = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, location);
            preparedStatement.setString(2, location);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
                System.out.println("Address: " + resultSet.getString("address"));
                System.out.println("City: " + resultSet.getString("city") + ", State: " + resultSet.getString("state"));
                System.out.println("Phone: " + resultSet.getString("phone_number") + ", Email: " + resultSet.getString("email"));
                System.out.println("---");
            }
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
