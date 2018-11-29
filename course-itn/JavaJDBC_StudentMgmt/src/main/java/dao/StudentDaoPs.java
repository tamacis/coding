/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Student;

/**
 *
 * @author cswl
 */
public class StudentDaoPs implements StudentDao  {

    public static void injectPreparedParams(PreparedStatement ps, Student s) throws SQLException {
        // assigning dynamic values to prepared statement
        ps.setString(1, s.getName());
        ps.setString(2, s.getAddress());
        ps.setInt(3, s.getGrade());
    }

    public  boolean update(Student s) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnector.getConnection();
            String sql = "UPDATE student_tbl SET "
                    + "name=?, address=?, grade=? where id=" + s.getId();

            ps = conn.prepareStatement(sql);
            injectPreparedParams(ps, s);

            int r = ps.executeUpdate(sql);
            if (r == 1) {
                System.out.println("Student record updated.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoPs.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ps = null;
        }
        return true;
    }

    public  void delete(int id) {
        Student s = null;

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnector.getConnection();
            String sql = "delete from student_tbl where id=" + id;

            ps = conn.prepareStatement(sql);

            if (ps.executeUpdate(sql) == 0) {
                System.out.println("Delete failed.");
            } else {
                System.out.println("Deleted one record.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoPs.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ps = null;
        }

    }

    public  void insert(Student s) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnector.getConnection();
            String sql = "insert into student_tbl (name,address,grade) "
                    + "values(?, ?, ?)";

            ps = conn.prepareStatement(sql);
            injectPreparedParams(ps, s);

            int r = ps.executeUpdate(sql);
            if (r == 1) {
                System.out.println("Student record inserted.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoPs.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ps = null;
        }

    }

    public  Student selectById(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        Student s = null;
        try {
            conn = DBConnector.getConnection();
            String sql = "select * from student_tbl where id=" + id;

            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(sql);
            if (!rs.next()) {
                return null;
            }

            s = new Student(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("grade"),
                    rs.getString("address")
            );

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoPs.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }
        return s;
    }

    public  ArrayList<Student> selectAll() {

        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Student> al = new ArrayList<>();

        try {
            conn = DBConnector.getConnection();

            String sql = "select * from student_tbl";

            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                // add one entry per row as a student object in arraylist
                al.add(new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("grade"),
                        rs.getString("address")
                ));
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoPs.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }

        return al;
    }

}
