/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author cswl
 */

/*
Bitwise Operator
& and
| or
~ not
>> right shift
<< left shift
>>> unsigned right shift
 */
public class BitwiseDemo {

    public static void main(String[] args) {
        int a = 44; // 101100
        int b = 27; //  11011

        System.out.println("a & b equals " + (a & b));
        System.out.println("a | b equals " + (a | b));
        System.out.println("~a equals " + ~a);
        System.out.println("a ^ b equals " + (a ^ b));
        System.out.println(a >> 1);
        System.out.println(a << 2);
        System.out.println(a);

        System.out.println(a >>= 1);
        System.out.println(a <<= 2);
        System.out.println(a);
        
        System.out.println(-a >>> 1);
    }

}
