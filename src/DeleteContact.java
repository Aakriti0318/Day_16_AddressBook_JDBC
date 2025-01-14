import java.sql.*;
public class DeleteContact {
    public void delete(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBookDB", "root", "password")) {
            String query = "DELETE FROM Contacts WHERE first_name = ? AND last_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, "joe");
            preparedStatement.setString(2, "Davis");
            preparedStatement.executeUpdate();

            System.out.println("Contact deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
