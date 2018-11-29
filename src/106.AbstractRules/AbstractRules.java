/*
 *   An abstract method cannot have a method body and it must have a semicolon directly
 *   after the signature.
 * 
 *   If at least one method inside of a class is marked abstract, then the class must be 
 *   marked abstract also.
 * 
 *   Applying the abstract modifier to a class prevents the class from being instantiated. 
 *   An abstract class can only be inherited.
 * 
 *   Abstract methods must be overridden in a concrete subclass. A concrete subclass is simply a
 *   class without the abstract modifier that extends an abstract class. 
 * 
 *   If a concrete subclass does not override an inherited abstract method then a compiler error
 *   will occur.
 *   An abstract class may contain static variables (class variables) and static methods.
*/


class AbstractRules {
    public static void main(String args[]) {
        Boeing787 commercial = new Boeing787();
        commercial.takeOff();
        commercial.land();

        Satellite hubble = new Satellite();
        hubble.takeOff();

        System.out.println("\nNumber of flying objects in this program: " + FlyingMachine.thingsFlyingAround);
    }
}

abstract class FlyingMachine { // If at least one method inside of a class is marked abstract, then the class must be marked abstract also.
    static int thingsFlyingAround = 0; //An abstract class may contain static variables (class variables) and static methods.
    { thingsFlyingAround++; } // instance initialization block

    abstract void takeOff(); // An abstract method cannot have a method body and must have a semicolon directly after the signature.   
}

abstract class Airplane extends FlyingMachine { // If at least one method inside of a class is marked abstract, then the class must be marked abstract also.
    abstract void land(); // An abstract method cannot have a method body and must have a semicolon directly after the signature. 
}

class Boeing787 extends Airplane { // A concrete subclass is simply a class without the abstract modifier that extends an abstract class.

    //Airplane a = new Airplane(); //NO - Applying the abstract modifier to a class prevents the class from being instantiated.

    @Override
    void takeOff() { // Abstract methods must be overridden in a concrete subclass.
        System.out.println("The 787 needs a very long runway to takeoff ...");
    }
    @Override
    void land() { // Abstract methods must be overridden in a concrete subclass.
        System.out.println("The 787 needs a very long runway to land ...");
    }    
}

class Satellite extends FlyingMachine {
    @Override
    void takeOff() {
        System.out.println("A satellite is propelled into space on a rocket and placed into orbit ...\n some fly high above the earth forever.");
    }
}