/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.dao;

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
public class DBConnection {

    // database url
    private static String url = "jdbc:mysql://localhost:3386/coursedb";
    private static String user = "cswl";
    private static String pass = "admin";

    private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            try {
                // This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
                // The driver is automatically registered via the SPI and manual 
                // loading of the driver class is generally unnecessary.
                // Unless your'e running Tomcat which cannot load it.
                try {
                    Class.forName("org.mariadb.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                    // Re throw in case of failure
                    throw new RuntimeException(ex);
                }
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                // Re throw in case of failure
                throw new RuntimeException(ex);

            }
        }
        return conn;
    }

}
