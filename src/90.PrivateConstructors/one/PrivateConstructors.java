package one;

// class Tester extends ConstructorOne { // Inheritance
class Tester { // extends Tester - If we try inheritance we will get a cyclic relationship error

    private Tester() { 
        super();
        System.out.println("Invoked the private Tester() constructor.");
    }

    public static void main(String args[]) {
        Tester t = new Tester(); // we can create an instance of Tester using a private constructor from within the same class
        // ConstructorOne co = new ConstructorOne(); // Reference
        // ConstructorOne co = new ConstructorOne("Whatever");
    }
}

class ConstructorOne {
    private ConstructorOne() { 
        super(); 
        System.out.println("Private constructor in ConstructorOne!");
    } 

    ConstructorOne(String doesNotMatter) { 
        this(); 
    } 
}