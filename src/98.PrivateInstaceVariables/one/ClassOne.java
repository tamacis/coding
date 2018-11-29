
package one;

// class Tester extends ClassOne { 
class Tester { 

    public static void main(String args[]) {
        ClassOne co = new ClassOne(); // test refereence
        //co.number = 111;

        //Tester t = new Tester(); // test inheritance
        //t.number = 111;

        // great - now use encapsulation
        //co.setNumber(111);
        //System.out.println("number = " + co.getNumber());

        //t.setNumber(444);
        //System.out.println("number = " + t.getNumber());

    }

}

class ClassOne {
        
    private int number = 0;

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return this.number;
    }
}