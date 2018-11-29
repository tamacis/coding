/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class TwoDimensionalTriangular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][];
        for (int i = 0; i < a.length;) {
            a[i] = new int[++i]; // Off by one error (i is 0 here) so pre increment 
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        
        
        //display in matrix form
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

}
