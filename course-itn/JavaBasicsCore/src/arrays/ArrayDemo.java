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
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element arr[" + i + "]= ");

            arr[i] = sc.nextInt();
            System.out.println("");
        }
        for (int e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println("");
        String[] country = {"Nepal", "india", "china", "USA", "japan"};
        for (String e : country) {
            System.out.print(e + ", ");
        }
        System.out.println("");

        // dynamic array init
        System.out.print("Enter size of an array");
        int n = sc.nextInt();
        System.out.println("");
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.arraycopy(arr, 0, arr1, 0, 3);

        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
