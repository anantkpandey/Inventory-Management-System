import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductManager {
    private Connection conn;

    public ProductManager(Connection conn){
        this.conn = conn;
    }

    public void addProduct(String name, int quantity, double price) throws SQLException{
        String sql = "INSERT INTO Products (name, quantity, price) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setInt(2, quantity);
        stmt.setDouble(3, price);
        stmt.executeUpdate();
    }
}