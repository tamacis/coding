/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import app.SQLExecUpdate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class CourseConnector {

    private static String url = "jdbc:mysql://localhost:3386/test_db"; // database url
    private static String user = "cswl";
    private static String pass = "bobo";

    private static Connection conn = null;

    static {
        // 1. driver class registration
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLExecUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static Connection getConnection() throws SQLException {
        if(conn == null)
            conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
}
