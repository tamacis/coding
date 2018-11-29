/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.StudentDao;
import java.util.ArrayList;
import modal.Student;

/**
 *
 * @author cswl
 */
public class StudentView {

    private static void displayHeaders() {
        System.out.print("ID \t");
        System.out.print("Name \t");
        System.out.print("Grade \t");
        System.out.print("Address");
        System.out.println("");
    }

    public static void displayStudent(Student s) {

        System.out.print(s.getId() + "\t");
        System.out.print(s.getName() + "\t");
        System.out.print(s.getGrade() + "\t");
        System.out.print(s.getAddress());
        System.out.println("");
    }

    public static void displayAllStudents(StudentDao sd) {

        ArrayList<Student> al = sd.selectAll();
        displayHeaders();
        for (Student s : al) {
            displayStudent(s);
        }
    }

    public static void displayHelp() {

        System.out.println("Available commands: add, delete, edit, help, list, quit");

    }

}
