/*
    If a method declaration in the superclass has no throws list, then methods in the subclass 
    CANNOT contain a throws list.

    If a method declaration in the superclass declares a checked exception in the throws list,
     then the subclass can declare the same exception in its throws list.

    If a method declaration in the superclass declares a checked exception in the throws list, 
    then the subclass can declare a subclass of that exception in its throws list.

    If a method declaration in the superclass declares a checked exception in the throws list, 
    then the subclass can have NO throws list.

    If a method declaration in the superclass declares a checked exception in the throws list, 
    then the subclass CANNOT declare a superclass of that exception in its throws list.
********************
    Basically

    Superclass doesnt have throws -> Subclass CANNOT have throws

    Superclass has throws -> Subclass can have none, same, or subclass of the Exception
               -> Subclass CANNOT have superclass of the Exception

*/

import java.io.*;

class MethodOverrideException {
    static String temp;

    public static void main(String args[]) {
        SuperClass super1 = new SuperClass();
        try {
            super1.uncheckedMethod("Hello World");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

        SubClass sub1 = new SubClass();
        try {
            sub1.uncheckedMethod(temp);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

        System.out.println();
        super1.checkedNoThrows();
        sub1.checkedNoThrows();

        System.out.println();
        try {
            super1.checkedThrows();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

        try {
            sub1.checkedThrows();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

    }
}

class SuperClass {
    void uncheckedMethod(String s) throws NullPointerException, ArithmeticException { // throws list unchecked exceptions are optional and pointless
        System.out.println(s.substring(200,300)); // StringIndexOutOfBoundsException
    }

    void checkedNoThrows() {
        System.out.println("Invoked the checkedNoThrows superclass method.");
    }

    void checkedThrows() throws IOException {
        throw new IOException();
    }
    
}

class SubClass extends SuperClass {
    void uncheckedMethod(String s) throws IndexOutOfBoundsException { /// throws list unchecked exceptions are optional and pointless
        System.out.println(s.length()); // NullPointerException
    }   
    
    //void checkedNoThrows() throws IOException {
    void checkedNoThrows() {
        System.out.println("Invoked the checkedNoThrows subclass method.");
    }  
    
    void checkedThrows() throws IOException { // YES - throws list is the same
        System.out.println("Invoked the checkedThrows subclass method.");
        throw new IOException();
    }      
    
    //void checkedThrows() throws EOFException { // YES - throws list contains subclass of IOException
    //    throw new EOFException();
    //}   

    //void checkedThrows() { // YES - missing throws list completely
    //    System.out.println("Invoked the checkedThrows subclass method.");
    //}

    //void checkedThrows() throws Exception { // NO - Exception is the superclass of IOException - not allowed
    //    System.out.println("Invoked the checkedThrows subclass method.");
    //    throw new Exception();
    //}
}
