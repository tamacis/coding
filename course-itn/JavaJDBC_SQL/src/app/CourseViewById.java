/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.CourseDao;
import java.util.Scanner;
import static jdk.nashorn.internal.runtime.Debug.id;
import model.CourseModel;

/**
 *
 * @author cswl
 */
public class CourseViewById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id of course: " );
        int id = sc.nextInt();
        
        CourseModel c = CourseDao.selectById(id);
        
        
        //display course
            System.out.print("ID \t");
            System.out.print("Name \t");
            System.out.print("Price \t");
            System.out.print("Duration \t");
            System.out.println("");
            
            System.out.print(c.getId() + "\t");
            System.out.print(c.getTitle() + "\t");
            System.out.print(c.getPrice() + "\t");
            System.out.print(c.getDuration() + "\t");
            System.out.println("");
        
    }
}
