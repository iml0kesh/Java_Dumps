package com.jdbcDumps.DbConnectionOracle;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DB_ShowAllTables {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1937");
            DatabaseMetaData dbmd = con.getMetaData();
            String table[] = {"TABLE"};
            ResultSet rs = dbmd.getTables(null,null,null,table);

            while(rs.next()){
                System.out.println(rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
