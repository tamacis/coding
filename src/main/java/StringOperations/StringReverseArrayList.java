/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author cswl
 */
public class StringReverseArrayList {
    // input string and reverse without using String .reverse();
    // check to see if its a palindrome string.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Convert to char array
        List<Character> chList = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        ArrayList<Character> chArr = new ArrayList<>(chList);

        // Reverse the string with String builder
        StringBuilder sb = new StringBuilder();
        for (char c : chArr) {
            sb.insert(0, c);
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
