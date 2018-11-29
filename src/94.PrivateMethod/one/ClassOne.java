package one;

//class Tester extends ClassOne { // Inheritance
class Tester { 
   
    public static void main(String args[]) {
        new Tester().TesterMethod(); // Reference from within the same class
        //new Tester().methodOne(); // Inheritance from outside the class
        //new ClassOne().methodOne(); // Reference
    }

    private void TesterMethod() {
        System.out.println("Private method invoked from TesterMethod()");
    }
}

public class ClassOne { 

    private void methodOne() {
        System.out.println("Private method invoked from class ONE!");
    } 
}
