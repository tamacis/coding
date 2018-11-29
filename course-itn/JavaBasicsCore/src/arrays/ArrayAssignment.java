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
public class ArrayAssignment {
    // input 10 numbers find
    // Sum, Average, max, min

    int[] arr;
    public final String[] NUMERALS = {
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eight", "ninth", "tenth"
    };

    ArrayAssignment(int n) {
        arr = new int[n];
    }

    public IntSummaryStatistics getStat() {
        return Arrays.stream(this.arr).summaryStatistics();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayAssignment ac = new ArrayAssignment(10);

        for (int i = 0; i < ac.arr.length; i++) {
            System.out.print("Enter the " + ac.NUMERALS[i] + " number: ");
            ac.arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("The sum of numbers is: " + ac.getStat().getSum());
        System.out.println("The average of numbers is: " + ac.getStat().getAverage());
        System.out.println("The greatest number is: " + ac.getStat().getMax());
        System.out.println("The smallest number is: " + ac.getStat().getMin());

    }
}
