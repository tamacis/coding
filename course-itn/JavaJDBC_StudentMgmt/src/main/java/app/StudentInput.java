/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;
import modal.Student;

/**
 *
 * @author cswl
 */
public class StudentInput {

    public static Student getStudent(Scanner sc) {
        Student s = new Student();
        System.out.print("Enter student name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter student address: ");
        s.setAddress(sc.nextLine());
        System.out.print("Enter student grade: ");
        s.setGrade(sc.nextInt());
        return s;
    }
    
}
