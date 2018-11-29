package one;

import two.*;

class Tester {

    public static void main(String args[]) {
        new ConstructorOne(); // from package one
        new ConstructorTwo(); // from package two
    }
}

public class ConstructorOne {

    public ConstructorOne() { 
        super(); 
        System.out.println("Public constructor in package ONE!");
    }
 
}
