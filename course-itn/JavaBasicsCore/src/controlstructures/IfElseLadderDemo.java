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
public class IfElseLadderDemo {

    public static void main(String[] args) {
        int mark;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        mark = input.nextInt();
        char grade;

        if (mark >= 90) {
            grade = 'A';
        } else if (mark >= 80) {
            grade = 'B';
        } else if (mark >= 70) {
            grade = 'C';
        } else if (mark >= 60) {
            grade = 'D';
        } else if (mark >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        if (grade == 'F') {
            System.out.println("You failed");
        } else {
            System.out.println("Grade " + grade);
        }
    }

}
