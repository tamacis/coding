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
public class TwoDimensionalArrayInput {

    public static void main(String[] args) {

        // Take input array multi-dimensional
        int[][] a = new int[2][2];
        Scanner sc = new Scanner(System.in);
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
