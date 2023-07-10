package com.jdbcDumps.DbConnectionMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nodemysql","root","1937");
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery("SELECT * FROM employee");
            while (re.next()){
                System.out.println(re.getInt(1) +" "+re.getString(2) +" "+re.getString(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
