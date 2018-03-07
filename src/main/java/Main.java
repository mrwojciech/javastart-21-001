
import java.sql.*;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/zad_dom?characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "root";
        Connection connection  = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "select * from zad_dom.zadanie";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()) {
            int id = resultSet.getInt(1); //id
            String name = resultSet.getString("nazwa");
            String producer = resultSet.getString("producent");
            String description = resultSet.getString(4); //code
            Double priceOfProduct = resultSet.getDouble(5); //code
            System.out.println(id + " " + name + " " + producer+ " " +description+" "+ priceOfProduct);
        }
        connection.close();
    }


}
