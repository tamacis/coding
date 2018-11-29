package one;

import two.YouArePublic;

//class Tester extends IAmPublic { // Inheritance in same package
//class Tester extends YouArePublic { // Inheritance in different package
class Tester {

    public static void main(String args[]) {
        // Reference in same package
        // IAmPublic iap = new IAmPublic();
        // iap.displayMessage();

        // Inheritance in same package or different package
        // Tester ot = new Tester();
        // ot.displayMessage();

        // Reference in different package
        // YouArePublic yap = new YouArePublic();
        // yap.displayMessage();

    }
}

public class IAmPublic {

    public void displayMessage() {
        System.out.println("I am public in package ONE!");
    }    
}

