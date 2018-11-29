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
import modal.Student;

/**
 *
 * @author cswl
 */
public class StudentDaoStmt implements StudentDao {

    public boolean update(Student s) {

        Statement stmt = null;
        try {
            // Create a statement;
            stmt = DBConnector.getStatement();
            // Write a SQL query
            String sql = "UPDATE student_tbl SET "
                    + "name='" + s.getName() + "',"
                    + "grade=" + s.getGrade() + ","
                    + "address='" + s.getAddress() + "'"
                    + "  where id=" + s.getId();

            System.out.println(sql);
            int r = stmt.executeUpdate(sql);
            if (r == 1) {
                System.out.println("Student record updated.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoStmt.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            stmt = null;
        }
        return true;
    }

    public void delete(int id) {
        Statement stmt = null;
        Student s = null;
        try {
            // Create a statement;
            stmt = DBConnector.getStatement();
            // Write a SQL query
            String sql = "delete from student_tbl where id=" + id;

            if (stmt.executeUpdate(sql) == 0) {
                System.out.println("Delete failed.");
            } else {
                System.out.println("Deleted one record.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoStmt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt = null;
        }
    }

    public Student selectById(int id) {

        Statement stmt = null;
        Student s = null;
        try {
            // Create a statement;
            stmt = DBConnector.getStatement();
            // Write a SQL query
            String sql = "select * from student_tbl where id=" + id;

            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.next()) {
                return null;
            }

            s = new Student(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("grade"),
                    rs.getString("address")
            );

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoStmt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt = null;
        }
        return s;
    }

    public ArrayList<Student> selectAll() {
        ArrayList<Student> al = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = DBConnector.getStatement();

            // 4. Write a SQL query
            String sql = "select * from student_tbl";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                // add one entry per row as a student object in arraylist
                al.add(new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("grade"),
                        rs.getString("address")
                ));
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoStmt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt = null;
        }

        return al;
    }

    public void insert(Student s) {
        String sql = "insert into student_tbl (name, grade, address)"
                + "values ('" + s.getName() + "',"
                + s.getGrade() + ", '"
                + s.getAddress() + "')";

        try {

            Statement stmt = DBConnector.getStatement();
            int i = stmt.executeUpdate(sql);
            if (i == 1) {
                System.out.println("One record inserted.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoStmt.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
