package one;

import two.*;

// class Tester extends ConstructorTwo {
class Tester extends ConstructorOne {

    public static void main(String args[]) {
        ConstructorOne co = new ConstructorOne(); // from package one - reference
        Tester t = new Tester(); // Inheritance
        //ConstructorTwo ct = new ConstructorTwo(); // from package two - reference
  
    }
}

public class ConstructorOne {
    protected ConstructorOne() { 
        super(); 
        System.out.println("Protected constructor in package ONE!");
    }
 
}