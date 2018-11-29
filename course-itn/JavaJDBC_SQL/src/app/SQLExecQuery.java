/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class SQLExecQuery {

    public static void main(String[] args) {
        // 1.  Driver registration for mysql jdbc
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLExecUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }

        String url = "jdbc:mysql://localhost:3386/test_db"; // database url
        String user = "cswl";
        String password = "bobo";

        // 2.  Obtain  connection object using DriverManager
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

            // 3. Create statement;
            stmt = conn.createStatement();

            // 4. Write a SQL query
            String sql = "select * from course";

            // 5. Execute query
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("title") + "\t"
                        + rs.getDouble("price") + "\t"
                        + rs.getString("duration")
                );
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLExecUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
