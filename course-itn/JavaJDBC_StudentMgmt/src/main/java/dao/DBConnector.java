/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class DBConnector {

    private static String url = "jdbc:mysql://localhost:3386/studentdb"; // database url
    private static String user = "cswl";
    private static String pass = "bobo";

    private static Connection conn = null;

    static {
        // 1. driver class registration
        // This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
        // The driver is automatically registered via the SPI and manual 
        // loading of the driver class is generally unnecessary.

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public static Connection getConnection() throws SQLException {
        if(conn == null)
            conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
    
    public static Statement getStatement() throws SQLException {
        getConnection();
        return conn.createStatement();
    }    
}
