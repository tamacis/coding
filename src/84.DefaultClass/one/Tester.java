package one;

import two.*;

//class Tester extends Insider { // Inheritance in same package
//class Tester extends OutSider { // Inheritance from different package - FAIL
class Tester {

    public static void main(String args[]) {
        // Reference in same package
        // Insider i = new Insider();
        // i.displayMessage();

        // Inheritance in same package or different package
        // Tester ot = new Tester();
        // ot.displayMessage();
    
        // Reference in different package
        // Outsider o = new Outsider(); // FAIL

        // Reference in different package
        // Oops o = new Oops(); 
        // o.displayMessage();
    }

}

class Insider {
    void displayMessage() {
        System.out.println("I am an insider in package ONE!");
    }    
}
