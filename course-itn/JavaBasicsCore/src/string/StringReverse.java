/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class StringReverse {
    // input string and reverse without using String .reverse();
    // check to see if its a palindrome string.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Convert to char array
        char[] chars = input.toCharArray();

        // Reverse the string with String builder
        StringBuilder sb = new StringBuilder();
        for (int i = (chars.length - 1); i >= 0; i--) {
            // System.out.println(i + "" + chars[i]); // for debug purposes
            sb.append(chars[i]);
        }
        String rvrsd = sb.toString();

        System.out.println("The reversed string is : " + rvrsd);

        // Convert both to lowercase and check 
        // so it passes on input like : Madam
        if (input.equalsIgnoreCase(rvrsd)) {
            System.out.println("The input string is a palindrome");
        }

    }
}
