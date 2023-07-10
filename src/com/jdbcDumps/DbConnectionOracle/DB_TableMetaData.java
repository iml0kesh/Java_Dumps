// 1. Write a java program to retrive table name , colname, Col Type, using result_set_metadata interface.

package com.jdbcDumps.DbConnectionOracle;

import java.sql.*;

public class DB_TableMetaData {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1937");
            PreparedStatement st = con.prepareStatement("select * from emp");
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("Table Name is:- "+rsmd.getTableName(1));
            System.out.println("Column Count is:- "+rsmd.getColumnCount());

            System.out.println("Column 1 name is:- "+rsmd.getColumnName(1));
            System.out.println("Column 1 DataType is:- "+rsmd.getColumnTypeName(1));

            System.out.println("Column 2 name is:- "+rsmd.getColumnName(2));
            System.out.println("Column 2 DataType is:- "+rsmd.getColumnTypeName(2));
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
