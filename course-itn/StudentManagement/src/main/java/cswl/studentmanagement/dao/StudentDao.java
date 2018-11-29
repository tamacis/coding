package cswl.studentmanagement.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cswl.studentmanagement.dao.DBConnection;
import cswl.studentmanagement.modal.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class StudentDao {

    public static void injectPreparedParams(PreparedStatement ps, Student c) throws SQLException {
        // assigning dynamic values to prepared statement
        ps.setString(1, c.getFirstName());
        ps.setString(2, c.getLastName());
        ps.setString(3, c.getCountry());
        ps.setString(4, c.getGender());
        ps.setString(5, c.getHobbies());
    }

    public static Student createStudentFromResult(ResultSet rs) throws SQLException{
        return new Student(
                rs.getInt("id"),
                rs.getString("firstname"),
                rs.getString("lastname"),
                rs.getString("country"),
                rs.getString("gender"),
                rs.getString("hobbies")
        );
    }

    public boolean update(Student s) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnection.getConnection();
            String sql = "UPDATE student_tbl SET "
                    + "firstname=?, lastname=?, country=?, gender=?, hobbies=?"
                    + " where id=" + s.getId();

            ps = conn.prepareStatement(sql);
            injectPreparedParams(ps, s);

            int r = ps.executeUpdate();
            if (r == 1) {
                System.out.println("Student record updated.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ps = null;
        }
        return true;
    }

    public void delete(int id) {
        Student s = null;

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnection.getConnection();
            String sql = "delete from student_tbl where id=" + id;

            ps = conn.prepareStatement(sql);

            if (ps.executeUpdate() == 0) {
                System.out.println("Delete failed.");
            } else {
                System.out.println("Deleted one record.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ps = null;
        }

    }

    public void insert(Student c) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnection.getConnection();
            String sql = "insert into student_tbl "
                    + "(firstname, lastname, country, gender, hobbies )"
                    + " values(?, ?, ?, ?, ?)";

            ps = conn.prepareStatement(sql);
            injectPreparedParams(ps, c);
            // debug show query
//            System.out.println("debug : " + ps); 

            int r = ps.executeUpdate();
            if (r == 1) {
                System.out.println("Student record inserted.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
            // Rethrow for debugging
            throw new RuntimeException(ex);

        } finally {
            ps = null;
        }

    }

    public Student selectById(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        Student s = null;

        try {

            conn = DBConnection.getConnection();
            String sql = "select * from student_tbl where id=" + id;

            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                return null;
            }

            s =createStudentFromResult(rs);

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }
        return s;
    }

    public ArrayList<Student> selectAll() {

        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Student> al = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();

            String sql = "select * from student_tbl";

            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                al.add(createStudentFromResult(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }

        return al;
    }

}
