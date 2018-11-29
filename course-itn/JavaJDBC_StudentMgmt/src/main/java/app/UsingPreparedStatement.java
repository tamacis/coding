/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.util.Scanner;
import modal.Student;
import dao.DBConnector;
import dao.StudentDaoPs;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class UsingPreparedStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = StudentInput.getStudent(sc);

        PreparedStatement ps = null;
        try {
            Connection conn = DBConnector.getConnection();
            String sql = "insert into student_tbl (name,address,grade) "
                    + "values(?, ?, ?)";

            ps = conn.prepareStatement(sql);

            StudentDaoPs.injectPreparedParams(ps, s);
            if (ps.executeUpdate() == 1) {
                System.out.println("One record inserted");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsingPreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }
    }
}
