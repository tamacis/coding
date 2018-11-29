package cswl.hibernatedemo.practice;

import cswl.hibernatedemo.dao.CourseDao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cswl
 */
public class Practice {
    public static void main(String[] args) {
        CourseDao.insert();
        CourseDao.insert();
        CourseDao.insert();
        CourseDao.insert();
        
        CourseDao.selectAll();
        CourseDao.update(2);
        
    }
}
