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
public class CreatingString {

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s = "Hello World";
        System.out.println("s1 == s? " + (s1 == s));

        String s2 = new String("Hello World");
        String s3 = new String("Hello World");
        System.out.println("s2 == s3? " + (s1 == s3));
        System.out.println("s2.equals(s3) " + (s2.equals(s3)));

        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String sChar = new String(c);
        System.out.println("string from char array: " + sChar);

        byte[] b = {65, 66, 67, 68, 69};
        String sByte = new String(b);
        System.out.println("string from byte array: " + sByte);
        

        
    }
}
