/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.IOException;

/**
 *
 * @author cswl
 */
public class ChildExceptionTest extends Parent {
    // 1) Rule: If the superclass method does not declare an exception,
    // subclass overridden method cannot declare the checked exception,

    // void showMessage() throws IOException {
    // System.out.println("child");
    // }
    
    // 2) Rule: If the superclass method does not declare an exception,
    // subclass overridden method can declare unchecked exception
    void showMessage() throws ArithmeticException {
        System.out.println("child");
    }

    // 3)Rule: If the superclass method declares an exception
    // subclass overriden method can declare same, subclass or no exception
    // but cannot declare the parent exception
    
    // 3a) Subclass overridden method declares parent exception.
    void displayMessage() throws Exception {
        System.out.println("child");
    }
    
    // 3b) subclass overridden method declares same exception
    void sayHello() throws Exception {
        System.out.println("child hello");
    }
    
    //3c) subclass overridden method declares subclass exception
    void sayHi() throws ArithmeticException {
        System.out.println("child hi");
    }
}

class Parent{}