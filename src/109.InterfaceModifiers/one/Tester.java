/*
 *  An interface is implicitly abstract.
 * 
 *  An interface may have only the following legal modifiers: public, abstract, and strictfp. 
    The default (package-private) access modifier is legal as well. 

 *  If the public access modifier is applied to an interface, the interface source code filename
    must match the name of the interface.
*/

package one;

import two.*;

class Tester implements InterfaceOne, InterfaceTwo  { 

    public static void main(String args[]) {
        System.out.println(inOne);
        System.out.println(inTwo);
    }
}

interface InterfaceOne {
    public static final String inOne = "Hello from interface ONE!";  // remember all interface variables are public static final implicitly
}
