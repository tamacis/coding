package cswl.studentmanagement.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cswl.studentmanagement.dao.DBConnection;
import cswl.studentmanagement.modal.Course;
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
public class CourseDao {

    public static void injectPreparedParams(PreparedStatement ps, Course c) throws SQLException {
        // assigning dynamic values to prepared statement
        ps.setString(1, c.getTitle());
        ps.setInt(2, c.getPrice());
        ps.setString(3, c.getDuration());
    }

    public static Course createCourseFromResult(ResultSet rs) throws SQLException {
        return new Course(rs.getInt("id"),
                rs.getString("title"),
                rs.getInt("price"),
                rs.getString("duration")
        );
    }

    public boolean update(Course s) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnection.getConnection();
            String sql = "UPDATE course_tbl SET "
                    + "title=?, price=?, duration=? where id=" + s.getId();

            ps = conn.prepareStatement(sql);
            injectPreparedParams(ps, s);

            int r = ps.executeUpdate();
            if (r == 1) {
                System.out.println("Course record updated.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ps = null;
        }
        return true;
    }

    public void delete(int id) {
        Course s = null;

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnection.getConnection();
            String sql = "delete from course_tbl where id=" + id;

            ps = conn.prepareStatement(sql);

            if (ps.executeUpdate() == 0) {
                System.out.println("Delete failed.");
            } else {
                System.out.println("Deleted one record.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ps = null;
        }

    }

    public void insert(Course c) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Create a statement;

            conn = DBConnection.getConnection();
            String sql = "insert into course_tbl (title, price , duration) values(?, ?, ?)";

            ps = conn.prepareStatement(sql);
            injectPreparedParams(ps, c);
            // debug show query
//            System.out.println("debug : " + ps); 

            int r = ps.executeUpdate();
            if (r == 1) {
                System.out.println("Course record inserted.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
            // Rethrow for debugging
            throw new RuntimeException(ex);

        } finally {
            ps = null;
        }

    }

    public Course selectById(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        Course s = null;

        try {

            conn = DBConnection.getConnection();
            String sql = "select * from course_tbl where id=" + id;

            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                return null;
            }

            s = new Course(rs.getInt("id"),
                    rs.getString("title"),
                    rs.getInt("price"),
                    rs.getString("duration")
            );

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }
        return s;
    }

    public ArrayList<Course> selectAll() {

        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Course> al = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();

            String sql = "select * from course_tbl";

            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                al.add(createCourseFromResult(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }

        return al;
    }

}
