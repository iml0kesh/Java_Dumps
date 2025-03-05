package java_mysql;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;


// JDBC Connection With MySql

public class JDBC_Demo {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String query = "select * from jdbc_Stds";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " " + name);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

class JDBC_Demo1 {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Connection c = DriverManager.getConnection(url, username, password);
            Statement st = c.createStatement();

            String query = "Show Databases";
            ResultSet rt = st.executeQuery(query);

            while (rt.next()){
                String dbname = rt.getString("database");
                System.out.println(dbname);
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}



// Insertion

class JDBC_Demo2 {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();

            String query = "INSERT INTO jdbc_stds (name) VALUES ('Meghana')";
            int rowsAffected = st.executeUpdate(query);

            System.out.println(rowsAffected > 0 ? "Data Inserted" : "Data Not Inserted");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Using String.format for insertion.

class JDBC_Demo3 {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();

            String query = String.format("Insert into jdbc_stds (name) Values ('%s')", "Uma");
            int rf = st.executeUpdate(query);

            System.out.println(rf > 0 ? "Data Inserted" : "Data Not inserted");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}



// Using PreparedStatement

class JDBC_Demo4 {

    private static final String url = "";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {

    }
}







