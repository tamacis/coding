/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.DaoFactory;
import java.util.Scanner;
import dao.StudentDao;
import java.util.InputMismatchException;
import modal.Student;

/**
 *
 * @author cswl
 */
public class StudentMgmt {
    
    // Easily change Implemenation
    public static StudentDao StudentDaoImpl = DaoFactory.get("StudentDaoPs");
    
    public static void main(String[] args) {

        System.out.println("Welcome to student management program.");
        StudentView.displayHelp();
        Scanner sc = new Scanner(System.in);

        char cmd;
        do {
            System.out.print("> ");
            cmd = sc.next().toLowerCase().charAt(0);
            switch (cmd) {
                case 'a':
                    insertStudent(sc);
                    break;
                case 'e':
                    updateStudent(sc);
                    break;
                case 'd':
                    deleteStudent(sc);
                    break;
                case 'h':
                    StudentView.displayHelp();
                    break;
                case 'l':
                    StudentView.displayAllStudents(StudentDaoImpl);
                    break;
                case 'q':
                    break;
                default:
                    System.out.print("Unknown command..");
                    StudentView.displayHelp();

                    break;
            }
        } while (cmd != 'q');

    }

    private static void insertStudent(Scanner sc) {
        // Inser data
        StudentDaoImpl.insert(StudentInput.getStudent(sc));
    }

    private static void updateStudent(Scanner sc) {
        // update
        // 1. whom to update
        System.out.println("Enter id of record you want to edit:");
        int id = sc.nextInt();
        Student s = StudentDaoImpl.selectById(id);
        StudentView.displayStudent(s);
        // 2. edit student info
        System.out.println("Change student information: (Y/N) ? ");
        if (sc.next().toLowerCase().charAt(0) == 'y') {
            s = StudentInput.getStudent(sc);
            s.setId(id);

            // 3. update into database
            StudentDaoImpl.update(s);
        }
    }

    private static void deleteStudent(Scanner sc) {
        // 1. whom to delete
        System.out.print("Enter id of record you want to delete: ");
        int id = -1;

        try {
            id = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input..   ");
            return;
        }

        Student s = StudentDaoImpl.selectById(id);
        if (s == null) {
            System.out.println("Selected student doesnt exists in database : id=" + id);
            return;
        }
        StudentView.displayStudent(s);
        // 2. delete student info
        System.out.println("Delete student? : (Y/N) ? ");
        if (sc.next().toLowerCase().charAt(0) == 'y') {

            // 3. delete into DAO
            StudentDaoImpl.delete(s.getId());
        }
    }

}
