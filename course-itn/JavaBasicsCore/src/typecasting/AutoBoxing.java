/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting;

/**
 *
 * @author cswl
 */
public class AutoBoxing {

    public static void main(String[] args) {
        // Wrapper Class
        int a = 10;
        Integer i = a; // Autoboxing
        int b = i;     // Auto Unboxing

        int c = i + a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("i = " + i);
        System.out.println("c = " + c);
        int d = Integer.parseInt("100");
        System.out.println("d = " + d);
        System.out.println("max = " + Integer.max(a, d));
        System.out.println(Integer.reverseBytes(a));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(i.toString());
        Object o = new Object();
        System.out.println(Object.class);
        Boolean j = false;
    }
}
