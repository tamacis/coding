/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class SwitchMarksGradeDemo {

    public static void main(String[] args) {
        int mark;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        mark = input.nextInt();
        mark /= 10;
        char grade;
        
        switch (mark) {
            case 10: case 9: 
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

        if (grade == 'F') {
            System.out.println("You failed");
        } else {
            System.out.println("Grade " + grade);
        }
    }

}
