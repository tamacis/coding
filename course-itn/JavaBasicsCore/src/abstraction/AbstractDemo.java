/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author cswl
 */

abstract public class AbstractDemo {

    int i = 100;

    public void display() {
        System.out.println("integer: " + i);
    }
    
    abstract public void change(int i);
    
//    public static void main(String[] args) {
    // Abstract class cannot be instatiated to creste an object
//        AbsoluteZero ad = new AbsoluteZero();
//        ad.display();
//    }
}
