/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author cswl
 */
public class DaoFactory {

    public static StudentDao get(String s) {
        if (s.equals(StudentDaoStmt.class.getName())) {
            return new StudentDaoStmt();
        } else if (s.equals(StudentDaoPs.class.getName())) {
            return new StudentDaoPs();
        } else {
            throw new RuntimeException("Dao Implementation not found: " + s);
        }
    }
}
