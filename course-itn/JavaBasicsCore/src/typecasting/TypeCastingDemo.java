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
public class TypeCastingDemo {

    public static void main(String[] args) {
        int a = 17;
        byte b = 51;
        float f = 79.37f;
        double d = 139.7571843130113;

        // Upcasting (Implicit cast)
        long l = a;
        short s = b;
        long result = (a + b) - l * s;
        System.out.println("l = " + l + "\nresult = " + result);

        // Downcasting (Explicit cast)
        System.out.println("Explicit cast short " + (float) s);

        a = (int) d;
        int i = 57;
        char c = (char) i;
        int value = (int) (d + f) * (a + s);
        System.out.println("a = " + a + "\nc = " + c + "\nvalue = " + value );
        System.out.println("c in int = " + (int) c );
    }
}
