/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class InputMismatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = Integer.parseInt("100"); 
            System.out.println("Enter numeric value: ");
            int b = sc.nextInt();
            System.out.println("The sum is: " + (a+b));
        } catch(NumberFormatException ne) {
            System.out.println(ne);
        } 
        
       
    }
}
