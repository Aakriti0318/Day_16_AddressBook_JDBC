import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
class Contact {
    public void contact(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book","root","Banda@123")) {
            String sql = "INSERT INTO contacts (firstname,lastname, phone_number, email, address, city, state, zip) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "joe");
                statement.setString(1, "Davis");
                statement.setString(2, "9145862394");
                statement.setString(3, "joeDavis123@gmail.com");
                statement.setString(4, "123B Washington");
                statement.setString(5,"Virginia");
                statement.setString(6, "Washington DC");
                statement.setString(7, "99403");
                statement.executeUpdate();
                System.out.println("Contact added Successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


