/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author cswl
 */
public class DataTypeDemo {
    public static void main (String[] args) {
        byte b ; // declaration
        b = 120;  // initalization
        
        byte b1 = 0b1111011; //byte literal 0b
        
        short s = 3400;
        short s1 = 0x1dad;
        
        int i = 1200;
        
        // long literal
        long l = 210000000000L;
        
        // float literal must be assigned with f 
        float f  = 12.55f;
        
        double d = 1355353.35252522424324234234;
        
        char c = 'x';
        int c1 = c;
        int c2 = 2309;
        char nc = (char) c2;
        
        System.out.println(b);
        System.out.println(b1);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println("The unicode for character 'x' is " + c1);
        System.out.println("The value " + c2 + " is for unicode character" + nc);
    }
}
