/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author cswl
 */
public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        int[] arr = new int[5];

        try {
            int result = a / b; // Divide by zero 
            System.out.println("result  is : " + result);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }

        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        } catch (RuntimeException ex) {

            System.out.println(ex);
            ex.printStackTrace();
        }

        System.out.println("Normal flow of program");

    }
}
