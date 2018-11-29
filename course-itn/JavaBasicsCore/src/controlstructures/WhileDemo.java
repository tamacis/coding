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
public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <=5) {
            System.out.print("* ");
            ++i;
        }
        
        label:
        while(true) {
            do {
            break label;
            } while (true);
        }
        
        char c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Student name is " + name);
            System.out.println("Enter another student(Y/N)");
            c = sc.next().toUpperCase().charAt(0);
            sc.nextLine(); // Consume the previous line feed.
        } while( c == 'Y');
    }
}
