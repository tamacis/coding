/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.dao;

import com.cswl.model.Course;
import java.util.List;

/**
 *
 * @author PemaSamtenLama
 */
public interface CourseDao {
    
    public void insert(Course cm);
    
    public List<Course> selectAll();
    
    public Course selectById(int id);
    
    public void update(Course cm);
    
    public void delete(Course cm);
}
