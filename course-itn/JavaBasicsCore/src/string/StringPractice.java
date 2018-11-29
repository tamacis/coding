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
public class StringPractice {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        char[] c = {'J', 'a', 'v', 'a'};
        String s5 = new String(c);
        byte[] b = {65, 66, 67, 68};
        String s6 = new String(b);

        System.out.println("String s1 == s2 :" + (s1 == s2));
        System.out.println("String s1 == s2 :" + s1.equals(s2));
        
        System.out.println("String s3 == s4 :" + (s3 == s4));
        System.out.println("String s3 == s4 :" + s3.equals(s4));
        

    }
}
