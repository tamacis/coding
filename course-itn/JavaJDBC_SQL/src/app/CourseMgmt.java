/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.CourseDao;
import java.util.ArrayList;
import model.CourseModel;

/**
 *
 * @author cswl
 */
public class CourseMgmt {

    public static void main(String[] args) {
        CourseModel cm = new CourseModel();
        cm.setTitle("C++");
        cm.setPrice(12000.00);
        cm.setDuration("2 Months");

        // insert
        CourseDao.insert(cm);

        // select 
        ArrayList<CourseModel> al = CourseDao.selectAll();

        //display all course
        for (CourseModel c : al) {
            System.out.print(c.getId() + "\t");
            System.out.print(c.getTitle() + "\t");
            System.out.print(c.getPrice() + "\t");
            System.out.print(c.getDuration() + "\t");
            System.out.println("");
        }
    }
}
