/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author cswl
 */
public class StringMethods {

    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = "Hello World";

        System.out.println("String split() method");
        String[] splitted = s.split(" ");
        for (String spl : splitted) {
            System.out.println(spl);
        }
        System.out.println();

        System.out.println("String compareTo() method");
        String s3 = "Sunday is first day of week";
        String s4 = "Saturday is holiday.";
        System.out.println(s3.compareTo(s4));
        System.out.println();

        System.out.println("String replace() method");
        String s5 = "Dog is an pet animal.";
        System.out.println(s5.replace("Dog", "Cat"));
        System.out.println();

        System.out.println("String indexOf() method");
        String s6 = "Apple a day keeps doctor away.";
        System.out.println(s6.indexOf("doctor"));
    }
}
