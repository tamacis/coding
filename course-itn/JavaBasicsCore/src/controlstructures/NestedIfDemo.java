package controlstructures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cswl
 */
public class NestedIfDemo {

    public static void main(String[] args) {
        System.out.println("Comparing three numbers");
        int a = 10, b = 15, c = 20;

        if (a > b) {
            if (a > c) {
                System.out.println("a is greatest among three");
            } else {
                System.out.println("c is greatest among three");
            }

        } else {
            if (b > c) {
                System.out.println("b is greatest among three");
            } else {
                System.out.println("c is greatest among three *");
            }
        }
    }
}
