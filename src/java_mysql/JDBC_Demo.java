package java_mysql;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;


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

// Using String.format for insertion, Update.

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
            String query1 = String.format("UPDATE jdbc_stds SET name = '%s' WHERE id = 3", "Murali");
            String query2 = "DELETE FROM jdbc_Stds WHERE ID = 3";

            int rf = st.executeUpdate(query2);

            System.out.println(rf > 0 ? "Data Inserted" : "Data Not inserted");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


// Using PreparedStatement

class JDBC_Demo4 {

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
            String query = "INSERT INTO jdbc_stds(name) VALUES (?)";

//            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,"Uma");

            int rf = pst.executeUpdate();
            System.out.println(rf > 0 ? "Data Inserted" : "Data Not inserted");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

class JDBC_Demo5 {
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

            String query = "SELECT * FROM jdbc_stds";
            PreparedStatement pst = con.prepareStatement(query);

            String query1 = "SELECT * FROM jdbc_stds WHERE ID = ? ";
            PreparedStatement pst1 = con.prepareStatement(query1);
            pst1.setInt(1, 1);

            String query2 = "UPDATE jdbc_stds SET name = ? Where ID = 4";
            PreparedStatement pst2 = con.prepareStatement(query2);
            pst2.setString(1, "Murali");

            ResultSet rt = pst.executeQuery();
            ResultSet rt1 = pst1.executeQuery();

            int rf = pst2.executeUpdate();
            System.out.println(rf > 0 ? "Updated" : "Not Updated");

            while(rt.next()){
                int id = rt.getInt("id");
                String name = rt.getString("name");
                System.out.println(id+" "+name);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Batch Processing
// using statement

class JDBC_Demo6 {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();

            while(true) {
                System.out.println("Enter Name:");
                String name = sc.next();
                String query = String.format("INSERT INTO jdbc_stds(name) VALUES ('%s')", name);
                st.addBatch(query);

                System.out.println("do you want to enter another name or exit? (Y/N)");
                String c = sc.next();
                if(c.equalsIgnoreCase("N")){
                    break;
                }
            }

            int[] arr = st.executeBatch();

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Batch Processing
// Using PreparedStatement

class JDBC_Demo7 {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO jdbc_stds(name) VALUES (?)";
            PreparedStatement pst = con.prepareStatement(query);

            while(true) {
                System.out.println("Enter Name:");
                String name = sc.next();
                pst.setString(1,name);
                pst.addBatch();

                System.out.println("do you want to enter another name or exit? (Y/N)");
                String c = sc.next();
                if(c.equalsIgnoreCase("N")){
                    break;
                }
            }

            int[] arr = pst.executeBatch();

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


// Transaction Handling JDBC

class JDBC_Demo8 {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}




