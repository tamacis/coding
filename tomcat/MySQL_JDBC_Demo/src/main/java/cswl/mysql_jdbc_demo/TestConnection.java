/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.mysql_jdbc_demo;

/**
 *
 * @author cswl
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    private static String url = "jdbc:mysql://localhost:3386/coursedb"; // database url
    private static String user = "cswl";
    private static String pass = "bobo";
    public static void main(String[] args) {
    
        Connection conn = null;

        try {
            // Register the driver
            LoadDriver.load();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3086/testdb?"
                    + "user=cswl&password=bobo");
            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception ex) {
            
        }
    }
}
