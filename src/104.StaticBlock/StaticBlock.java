/*
 There are some major differences between instance and static initialization blocks. 

 A static initialization block is not dependant upon a constructor to be invoked. 
 A static initialization block is executed when the class is first accessed, 
 either to create an instance, or to directly access a class variable or a static method.

 A static Initialization block will only be executed once throughout the entire program; 
 it won't matter how many objects you create or if you directly access a static member.
*/

class StaticBlock {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i ++ ) {
            new Duck(); // instance initialization block
        }

        for (int i = 0; i < 5; i ++ ) {
            Goose.myInt++; // static initialization block
            //Goose.myMethod(); // static initialization block
            //new Goose();
        }

    }
}

class Duck {
	{ System.out.println("Duck"); }
}

class Goose {
    static int myInt = 0;
    
    static { System.out.println("Goose"); } // only invoked once

    static void myMethod() { myInt++; }
}
