package operators;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cswl
 */
public class RelationalOperatorDemo {

    /* comparison
    <
    >
    ==
    !=
    
     */
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("a is greater than b " + (a > b));
        System.out.println("a is smaller than b " + (a < b));
        System.out.println("a is equals than b " + (a == b));
        System.out.println("a is not equals than b " + (a != b));
        
        System.out.println("a is greater than or equal b " + (a >= b));
        System.out.println("a is lesser than or equal  b " + (a <= b));
    }
}
