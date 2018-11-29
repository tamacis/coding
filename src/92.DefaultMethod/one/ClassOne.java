package one;

import two.*;

// class Tester extends ClassTwo { // Inheritance package two
class Tester extends ClassOne { // Inheritance package one

    public static void main(String args[]) {
        new Tester().methodOne(); // Inheritance package one 
        new ClassOne().methodOne(); // Reference package one
        // new Tester().methodTwo(); // Inheritance package two
        // new ClassTwo().methodTwo(); // Reference package two
    }
}

class ClassOne {
    void methodOne() {
        System.out.println("Default method invoked in package ONE!");
    } 
}