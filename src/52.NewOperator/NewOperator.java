class NewOperator {
    public static void main(String args[]) {
        Acme a; // declare a reference variable of object type Acme
        a = null; // assign the reference variable a null value;
        System.out.println("a = " + a);

        System.out.println("----------");
        // the new operator Instantiates an Acme object in memory returns a reference to the new object. 
        // the assignment operator assigns the returned reference to the reference variable.
        a = new Acme(); 
        System.out.println(a);
                                 
        System.out.println("----------");
        // loop 5 times showing what the NEW operator returns as a reference 
        for (int i = 0; i < 5; i++) {
            System.out.println(new Acme()); // display the return value of the new operator when it Instantiates an Acme object.
        }
        // Note: the output will differ with regards to the memory address, but all references will begin with Acme@
    }
}

class Acme {
    // empty class
}