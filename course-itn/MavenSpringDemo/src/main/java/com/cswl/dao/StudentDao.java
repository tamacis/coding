/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.dao;

import com.cswl.model.Student;
import java.util.List;

/**
 *
 * @author PemaSamtenLama
 */
public interface StudentDao {
    
    public void insert(Student sm);
    
    public List<Student> selectAll();
    
    public Student selectById(int id);
    
    public void update(Student sm);
    
    public void delete(Student sm);
}
