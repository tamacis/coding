/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CourseModel;

/**
 *
 * @author cswl
 */
public class CourseDao {

    public static CourseModel selectById(int id) {
        Statement stmt = null;
        CourseModel cm = null;
        try {
            Connection conn = CourseConnector.getConnection();

            // Create a statement;
            stmt = conn.createStatement();

            // Write a SQL query
            String sql = "select * from course where id=" + id;

            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.next()) 
                   return null;
            
            cm = new CourseModel(rs.getInt("id"),
                    rs.getString("title"),
                    rs.getDouble("price"),
                    rs.getString("duration")
            );

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt = null;
        }
        return cm;
    }

    public static ArrayList<CourseModel> selectAll() {

        ArrayList<CourseModel> cm = new ArrayList<>();
        Statement stmt = null;
        try {
            Connection conn = CourseConnector.getConnection();

            // 3. Create a statement;
            stmt = conn.createStatement();

            // 4. Write a SQL query
            String sql = "select * from course";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                cm.add(new CourseModel(rs.getInt("id"),
                        rs.getString("title"),
                        rs.getDouble("price"),
                        rs.getString("duration")
                ));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt = null;
        }
        return cm;
    }

    public static void insert(CourseModel cm) {
        Statement stmt = null;
        // 2. create connection object using DriverManager
        try {
            Connection conn = CourseConnector.getConnection();

            // 3. Create a statement;
            stmt = conn.createStatement();

            // 4. Write a SQL query
            String sql = "insert into course (title, price, duration) "
                    + "values('" + cm.getTitle() + "',"
                    + cm.getPrice() + ", '"
                    + cm.getDuration() + "')";

            // 5. Execute query
            int i = stmt.executeUpdate(sql);
            if (i == 1) {
                System.out.println("One record inserted.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt = null;
        }

    }
}
