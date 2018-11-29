/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.ArrayList;
import mappers.StudentMapper;
import props.Student;

/**
 *
 * @author cswl
 */
public class StudentTable {

    private static void showHeaders() {
        System.out.print(StudentMapper.NAME + "\t\t | ");
        System.out.print(StudentMapper.ROLL + "\t | ");
        System.out.print(StudentMapper.CLASS + "\t | ");
        System.out.print(StudentMapper.SECTION + "\t | ");
        System.out.print(StudentMapper.FACULTY + " \t | ");
        System.out.println();
    }

    public static void render(ArrayList<Student> sl) {
        showHeaders();
        for (Student std : sl) {
            System.out.print(std.getName() + "\t\t | ");
            System.out.print(std.getRoll() + "\t | ");
            System.out.print(std.getClassLevel() + "\t\t | ");
            System.out.print(std.getSection() + "\t\t | ");
            System.out.print(std.getFaculty() + " \t | ");
            System.out.println();
        }
    }


}
