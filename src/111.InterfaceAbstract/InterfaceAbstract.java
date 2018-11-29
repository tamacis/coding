/*
 * An abstract method cannot have a method body and it must have a semicolon directly after the signature.
 
 * An abstract method is implicitly public and abstract. You may explicitly apply both or either one 
if you like.

 * Abstract methods must be overridden in a concrete subclass. A concrete subclass is simply a class 
   without the abstract modifier that implements an interface. 
   If a concrete subclass does not override an inherited abstract method then a compiler error will occur.
*/

class InterfaceAbstract {
    public static void main(String args[]) {
        new Bobby().sellHouse();
    }
}

class Bobby implements GrandmasWill {
    @Override
    boolean takeCareOfHoardingIssue() {
        System.out.println("Call family and sort through stuff ... no small task!");
        return true; // never ending task
    }
    @Override
    void sellHouse() {
        int i = 1;
        while(takeCareOfHoardingIssue()) {
            System.out.println("Month "+i+" of sorting ...");
            i++;
            if (i==5) break;
        }
        System.out.println("Time to call a realtor.");
        spendInheritance();
    }
    @Override
    public void spendInheritance() {
        System.out.println("I\'m going on a vacation!");
    }
}

interface GrandmasWill {
    boolean takeCareOfHoardingIssue(); // decades of collections
    void sellHouse();
    public abstract void spendInheritance();
}
