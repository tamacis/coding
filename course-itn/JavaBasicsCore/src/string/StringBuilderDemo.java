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
public class StringBuilderDemo {

    public static void main(String[] args) {
        // String builder is mutable class
        // substitute to java string class when we have to 
        // do lots of string manipulation

        StringBuilder sb1 = new StringBuilder("Java course");
        
        sb1.ensureCapacity(50);
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        
        sb1.replace(5, 11, "101");
        System.out.println(sb1);

        sb1.append(" Programming Course again");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        
        sb1.reverse();
        System.out.println(sb1);
        
        sb1.delete(0, 6);
        sb1.reverse();
        System.out.println(sb1);
        
    }
}
