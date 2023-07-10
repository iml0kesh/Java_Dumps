package com.jdbcDumps.DbConnectionOracle;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DB_DataBaseMetaData {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1937");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Driver Name is:- "+dbmd.getDriverName());
            System.out.println("Driver Version is:- "+dbmd.getDriverVersion());
            System.out.println("UserName :- "+dbmd.getUserName());
            System.out.println("DataBase Product Name:- "+dbmd.getDatabaseProductName());
            System.out.println("DtaBase Product Version:- "+dbmd.getDatabaseProductVersion());

            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
