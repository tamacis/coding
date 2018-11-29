package one;

import two.*;

// class Tester extends ConstructorTwo { // error
class Tester {

    public static void main(String args[]) {
        new ConstructorOne(); // from package one
        //new ConstructorTwo(); // from package two - error
    }
}

class ConstructorOne {

    ConstructorOne() { 
        super(); 
        System.out.println("Default constructor in package ONE!");
    }
 
}

