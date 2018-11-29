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
public class ArithmeticOperatorDemo {

    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++); // 1  post-increment
        System.out.println(i); // 2 

        System.out.println(++i); // 3 pre increment

        int j = 5;

        i = i + 10; //13
        i += 10; //23

        
        i %= j; // i =  i  % j;  3
        System.out.println(i);
    }
}
