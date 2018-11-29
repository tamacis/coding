/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.IntSummaryStatistics;

/**
 *
 * @author cswl
 */
public class ArrayGreatestInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element arr[" + i + "]= ");
            arr[i] = sc.nextInt();
            System.out.println("");
        }
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        int g = stat.getMax();
        System.out.println("The greatest element is " + g);
    }
}
