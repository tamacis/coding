/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author cswl
 */
public class Sum {

    static long sum(int n, long t) {
        if (n == 0) {
            return t;
        } else {
            return sum(n - 1, t + n);
        }
    }

    public static void main(String[] args) {

        System.out.println("Sum of first 10 numbers is " + sum(10, 0));
        // Will blow the stack
        System.out.println("Sum of first 1000 numbers" + sum(100_000, 0));
    }
}
