package two;

public class ConstructorTwo extends IAmSafeInPackageTwo {

    public ConstructorTwo() { 
       this(0);
        System.out.println("Public constructor in package TWO!");
    }
 
    public ConstructorTwo(int a) {
        System.out.println("Overloaded constructor in package TWO!");
    }
}

class IAmSafeInPackageTwo {
    IAmSafeInPackageTwo() {
        System.out.println(">>>Package two - default access class with default access constructor  ... ");
        System.out.println("with default access method was just accessed in package one");
        methodInPackageTwo();        
    }

    void methodInPackageTwo() {
        System.out.println("Method in package two exposed outside of package <<<");
    }
}
