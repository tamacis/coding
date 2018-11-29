/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputs;

import java.util.Scanner;
import mappers.StudentMapper;
import props.Student;

/**
 *
 * @author cswl
 */
public class InputManager {
       
    public Student addStudent(Scanner sc) {
        String name;
        int roll;
        int classLevel;
        String section;
        String faculty;

        System.out.print(StudentMapper.NAME + ": ");
        name = sc.nextLine();

        System.out.print(StudentMapper.ROLL + ": ");
        while (true) {
            try {
                roll = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please input a valid " + StudentMapper.ROLL + ": ");
            }
        }

        System.out.print(StudentMapper.CLASS + ": ");
        while (true) {
            try {
                classLevel = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please input a valid " + StudentMapper.CLASS + ": ");
            }
        }

        System.out.print(StudentMapper.SECTION + ": ");
        section = sc.nextLine();

        System.out.print(StudentMapper.FACULTY + ": ");
        faculty = sc.nextLine();

        return new Student(name, roll, classLevel, section, faculty);

    }
}
