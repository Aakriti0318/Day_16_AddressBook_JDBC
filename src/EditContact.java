import java.sql.*;

public class EditContact {
    public void edit(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBookDB", "root", "password")) {
            String query = "UPDATE Contacts SET phone_number = ? WHERE first_name = joe AND last_name = Davis";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(3, "1234567890");
            preparedStatement.setString(4, "john.doe@example.com");
            preparedStatement.setString(5, "123 Elm St");
            preparedStatement.setString(7, "New York");
            preparedStatement.setString(6, "NY");
            preparedStatement.setInt(8, 10001);
            preparedStatement.executeUpdate();

            System.out.println("Contact Updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
