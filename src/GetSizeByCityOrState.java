import java.sql.*;
public class GetSizeByCityOrState {
    public void getSize(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBookDB", "root", "password")) {
            String query = "SELECT city, state, COUNT(*) AS size FROM Contacts GROUP BY city, state";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("City: " + resultSet.getString("city") + ", State: " + resultSet.getString("state") + ", Count: " + resultSet.getInt("size"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
