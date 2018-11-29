/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

/**
 *
 * @author cswl
 */
public class IfDemo {

    public static void main(String[] args) {
        boolean b = false;
        if (b) {
            System.out.println("This boolean value is " + b);
        } else {
            System.out.println("Boolean is false");
        }
        // You can skip braces for single line if
        if (b) 
            System.out.println("This boolean value is " + b);
        
        System.out.println("Continue with program");
    }
}
