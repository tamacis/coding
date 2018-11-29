/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.service;

import com.cswl.model.Course;
import java.util.List;

/**
 *
 * @author cswl
 */
public interface CourseService {
    public void addCourse(Course cm);
    public List<Course> getAllCourse();
    public Course getCourseByID(int id);
    public void updateCourse(Course cm);
    public void deleteCourse(Course cm);
}
