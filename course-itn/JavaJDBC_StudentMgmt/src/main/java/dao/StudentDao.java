/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modal.Student;

/**
 *
 * @author cswl
 */
public interface StudentDao {

    void insert(Student s);

    void delete(int id);

    boolean update(Student s);

    Student selectById(int id);

    ArrayList<Student> selectAll();

}
