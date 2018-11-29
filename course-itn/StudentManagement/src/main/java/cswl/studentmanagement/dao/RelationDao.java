/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.dao;

import cswl.studentmanagement.modal.StudentCourse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author cswl
 */
public class RelationDao {

    public static StudentCourse createStudentCourseFromResult(ResultSet rs) throws SQLException {
        return new StudentCourse(
                rs.getInt(1),
                rs.getInt(4),
                rs.getString(2) + " " + rs.getString(3),
                rs.getString(5)
        );
    }

    public void addRelation(int sid, int cid) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = null;
            String sql = "insert student_course  (sid, cid) "
                    + " values(?, ?) ";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, sid);
            ps.setInt(2, cid);

            if (ps.executeUpdate() == 1) {
                System.out.println("Relation added.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ArrayList<StudentCourse> getStudents() {
        ArrayList<StudentCourse> al = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = null;
            String sql = "select s.id, s.firstname, s.lastname, c.id, c.title "
                    + "from student_tbl as s, course_tbl as c, student_course as sc "
                    + "where s.id=sc.sid and c.id=sc.cid";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                al.add(createStudentCourseFromResult(rs));
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return al;
    }
}
