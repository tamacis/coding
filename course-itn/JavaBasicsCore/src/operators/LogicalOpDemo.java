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
public class LogicalOpDemo {

    public static void main(String[] args) {

        // boolean operator only.. true or false
        // either variable or expression that returns a boolean
        // (b1 & b2)
        // ( a > b | b < c)
        boolean b1 = true;
        boolean b2 = false;

        int a = 100;
        int b = 15;
        int c = 20;

        // & and | do not short circut
        // && and || short circuit
        System.out.println("a is greatest number "
                + ((a > b) && (a > c)));
        System.out.println("b is greater than at least one number "
                + ((b > a) || (b > c)));

        // ternary operator
        double result = (b == 0) ? 0 : ((double) a / (double) b);
        System.out.println("the result is " + result);
    }
}
