
package one;

import two.*;

//class Tester extends ClassTwo { 
class Tester { 

    public static void main(String args[]) {
        ClassOne co = new ClassOne();
        co.oneNumber = 111;
        co.displayOneNumber();

        //ClassTwo ct = new ClassTwo();
        //ct.twoNumber = 222;
        //ct.displayTwoNumber();

        //Tester t = new Tester();
        //t.twoNumber = 222;
        //t.displayTwoNumber();
    }

}

class ClassOne {
        
    protected int oneNumber = 0;

    void displayOneNumber() {
        System.out.println("The value of oneNumber = " + oneNumber);
    }    
}

