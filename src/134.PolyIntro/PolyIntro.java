/*
    A reference variable must be declared as a specific type.
    That reference variable may be assigned to an object of that specific type, or any object 
    that is a subtype of the declared type.

    The object type that a reference variable is declared as will directly affect which methods
    it may invoke.

    We can use a technique called casting to invoke methods from subclasses that are not known to 
    the reference variable superclass type.

    An interface can be the type for a reference variable.

    The instanceof operator can be used to determine if a object is a subtype of another class
    or interface.

    polymorphic method invocation only applies to instance methods. 
*/


class PolyIntro {
    public static void main(String args[]) {
        Car c = new Car();
        HondaAccord ha = new HondaAccord();
        ToyotaPrius tp = new ToyotaPrius();

        displayAverage(c);
        displayAverage(ha);
        displayAverage(tp);
    }

    static void displayAverage(Car param) {
        param.averagePrice();
    }

}

class Car {
    void averagePrice() {
        System.out.println("The average price of a new car is $28,400.");
    }
}

class HondaAccord extends Car {
    @Override
    void averagePrice() {
       System.out.println("The average price of a new Honda Accord is $26,007.");
    }
}

class ToyotaPrius extends Car {
    @Override
    void averagePrice() {
       System.out.println("The average price of a new Toyota Prius is $23,450.");
    }
}

        //Car ha = new HondaAccord();
        //Car tp = new ToyotaPrius();
    //@Override
    //void averagePrice() {
    //    System.out.println("The average price of a new Honda Accord is $26,007.");
    //}
    //@Override
    //void averagePrice() {
    //    System.out.println("The average price of a new Toyota Prius is $23,450.");
    //}
